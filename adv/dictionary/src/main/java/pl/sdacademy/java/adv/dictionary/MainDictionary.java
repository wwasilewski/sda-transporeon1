package pl.sdacademy.java.adv.dictionary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

public class MainDictionary {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        final List<String> allWords = Files.readAllLines(Path.of("dict/slowa.txt"));
        final String regex = "^.ada.ie$";

        //single thread
        final long beforeSingleThread = System.currentTimeMillis();
        final List<String> singleThreadResult = findMatchingLines(allWords, "^.ada.ie$");
        final long timeSingleThread = System.currentTimeMillis() - beforeSingleThread;

        System.out.printf("\n[SINGLE THREAD] Results: %d, Time: %d [ms]\n", singleThreadResult.size(), timeSingleThread);
        singleThreadResult.forEach(System.out::println);

        //multiple threads
        final int threads = 6;
        final int allWordsCount = allWords.size();
        final int chunkSize = allWordsCount/threads;

        System.out.printf("\nAll words: %d, Chunk ranges:\n", allWordsCount);
        final List<List<String>> chunks = new LinkedList<>();
        for (int i = 0; i < threads; i++) {
            final int start = i * chunkSize;
            final int end = (i == threads-1) ? allWordsCount : ((i+1) * chunkSize);
            System.out.printf("%d:%d\n", start, end);
            chunks.add(allWords.subList(start,end));
        }

        final ExecutorService executorService = Executors.newFixedThreadPool(threads);

        //futures
        final List<Future<List<String>>> futures = new LinkedList<>();

        final long beforeMultiThread = System.currentTimeMillis();
        for (List<String> chunk : chunks) {
            final Future<List<String>> chunkResult = executorService.submit(() -> findMatchingLines(chunk, regex));
            futures.add(chunkResult);
        }

        final List<String> multiThreadResult = new LinkedList<>();
        for (Future<List<String>> future : futures) {
            multiThreadResult.addAll(future.get());
        }
        final long timeMultiThread = System.currentTimeMillis() - beforeMultiThread;
        System.out.printf("\n[MULTIPLE THREADS] Results: %d, Time: %d [ms]\n", multiThreadResult.size(), timeMultiThread);
        multiThreadResult.forEach(System.out::println);

        //collection
        final List<String> sharedResultList = Collections.synchronizedList(new LinkedList<>());
        final CountDownLatch countDownLatch = new CountDownLatch(threads);

        final long beforeSharedCollection = System.currentTimeMillis();
        for (List<String> chunk : chunks) {
            executorService.submit(() -> {
               final List<String> partialResult = findMatchingLines(chunk, regex);
               sharedResultList.addAll(partialResult);
               countDownLatch.countDown();
            });
        }

        countDownLatch.await();

        final long timeSharedCollection = System.currentTimeMillis() - beforeSharedCollection;
        System.out.printf("\n[SHARED COLLECTION] Results: %d, Time: %d [ms]\n", sharedResultList.size(), timeSharedCollection);
        sharedResultList.forEach(System.out::println);

        executorService.shutdown();
    }

    private static List<String> findMatchingLines(List<String> source, String regex) {
        final List<String> result = new LinkedList<>();
        for (String line : source) {
            if (line.matches(regex)) {
                result.add(line);
            }
        }

        return result;
    }
}

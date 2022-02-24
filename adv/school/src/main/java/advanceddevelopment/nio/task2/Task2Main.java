package advanceddevelopment.nio.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task2Main {

    public static void main(String[] args) {
        printAllLines();
    }

    public static void printAllLines() {
        Path path = Paths.get("D://test/dzialaj.txt");
        String line;

        try (BufferedReader br = Files.newBufferedReader(path)) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printAllLinesNIO() {
        //TODO
    }
}

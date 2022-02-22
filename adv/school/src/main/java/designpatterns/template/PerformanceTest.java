package designpatterns.template;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class PerformanceTest {

    List<Long> results = new ArrayList<>();

    abstract void runTestedMethod();

    abstract int howManyIterations();

    public void runPerformanceTest() {
        for (int i = 0; i < howManyIterations(); i++) {
            long beforeTest = System.currentTimeMillis();

            runTestedMethod();

            long afterTest = System.currentTimeMillis();
            long lengthOfTest = afterTest - beforeTest;
            results.add(lengthOfTest);
        }
        Collections.sort(results);
        System.out.println("shortest time: " + results.get(0));
        System.out.println("shortest time: " + results.get(results.size() - 1));
    }
}

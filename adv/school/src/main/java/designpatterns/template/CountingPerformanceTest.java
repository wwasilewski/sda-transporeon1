package designpatterns.template;

public class CountingPerformanceTest extends PerformanceTest {

    @Override
    void runTestedMethod() {
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum = sum + i;
        }
    }

    @Override
    int howManyIterations() {
        return 1;
    }
}

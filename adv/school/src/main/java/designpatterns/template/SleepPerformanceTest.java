package designpatterns.template;

public class SleepPerformanceTest extends PerformanceTest {

    @Override
    void runTestedMethod() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    int howManyIterations() {
        return 10;
    }
}

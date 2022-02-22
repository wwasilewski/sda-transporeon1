package designpatterns.template;

public class Main {

    public static void main(String[] args) {
        SleepPerformanceTest test1 = new SleepPerformanceTest();
        test1.runPerformanceTest();

        CountingPerformanceTest test2 = new CountingPerformanceTest();
        test2.runPerformanceTest();
    }
}

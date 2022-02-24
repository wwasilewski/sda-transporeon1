package advanceddevelopment.threads.task1;

public class Task1Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1000; i <= 2000; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 14300; i <= 17800; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}

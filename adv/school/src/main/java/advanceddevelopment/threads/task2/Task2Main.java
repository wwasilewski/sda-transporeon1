package advanceddevelopment.threads.task2;

public class Task2Main {

    public static void main(String[] args) {
        Bridge bridge = new Bridge();
        Car car1 = new Car("car1", "combi");
        Car car2 = new Car("car2", "suv");

        Thread thread1 = new Thread(() -> bridge.driveThrough(car1));
        Thread thread2 = new Thread(() -> bridge.driveThrough(car2));

        thread1.start();
        thread2.start();
    }
}

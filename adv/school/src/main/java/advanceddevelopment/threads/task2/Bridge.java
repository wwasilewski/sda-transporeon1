package advanceddevelopment.threads.task2;

public class Bridge {

    public synchronized void driveThrough(Car car) {
        System.out.println("driving through: " + car);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("finished" + car);
    }
}

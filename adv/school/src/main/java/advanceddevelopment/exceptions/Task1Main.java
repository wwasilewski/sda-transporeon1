package advanceddevelopment.exceptions;

public class Task1Main {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        try {
            System.out.println(task1.divide(4, 2));
            System.out.println(task1.divide(4, 0));
        } catch (MyException e) {
            e.printStackTrace();
        } finally {
            System.out.println("FINALLY IS HERE");
        }
    }
}

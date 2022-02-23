package advanceddevelopment.oop.task6;

public class Task6Main {

    public static void main(String[] args) {
        Movable p1 = new MovablePoint(3, 4,1,1);
        System.out.println(p1);

        p1.moveDown();
        System.out.println(p1);

        p1.moveRight();
        System.out.println(p1);

        p1.moveUp();
        System.out.println(p1);
    }
}

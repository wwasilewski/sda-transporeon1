package advanceddevelopment.oop.task5;

import advanceddevelopment.oop.task1.Point2D;

public class Task5Main {

    public static void main(String[] args) {
        Line line = new Line(new Point2D(1f, 1f), new Point2D(1f, 1f));
        System.out.println(line.getLength());

        System.out.println(line.getCenter());
    }
}

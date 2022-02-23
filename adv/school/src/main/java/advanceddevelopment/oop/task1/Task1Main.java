package advanceddevelopment.oop.task1;

public class Task1Main {

    public static void main(String[] args) {
        Point2D emptypoint2D = new Point2D();
        System.out.println(emptypoint2D);

        Point2D point2D = new Point2D(3f, 6f);
        System.out.println(point2D);

        Point3D point3D = new Point3D(1f, 3f, 6f);
        System.out.println(point3D);
    }
}

package advanceddevelopment.oop.task5;

import advanceddevelopment.oop.task1.Point2D;

public class Line {

    private Point2D point1;
    private Point2D point2;

    public Line(Point2D point1, Point2D point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Line(Float point1Begin, Float point1End, Float point2Begin, Float point2End) {
        this.point1 = new Point2D(point1Begin, point1End);
        this.point2 = new Point2D(point2Begin, point2End);
    }

    public Point2D getPoint1() {
        return point1;
    }

    public void setPoint1(Point2D point1) {
        this.point1 = point1;
    }

    public Point2D getPoint2() {
        return point2;
    }

    public void setPoint2(Point2D point2) {
        this.point2 = point2;
    }

    public float getLength() {
        return (float) Math.sqrt((Math.pow(point2.getX() - point1.getX(), 2)
                + Math.pow(point2.getY() - point1.getY(), 2)));
    }

    public Point2D getCenter() {
        float xCenter = (point1.getX() + point2.getX()) / 2;
        float yCenter = (point1.getY() + point2.getY()) / 2;
        return new Point2D(xCenter, yCenter);
    }
}

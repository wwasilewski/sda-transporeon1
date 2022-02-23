package advanceddevelopment.oop.task7;

public class Circle implements GeometricObject {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.ceil(2 * Math.PI * radius);
    }

    @Override
    public double getArea() {
        return Math.ceil(Math.PI * radius * radius);
    }
}

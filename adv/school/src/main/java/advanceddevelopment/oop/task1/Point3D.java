package advanceddevelopment.oop.task1;

import java.util.ArrayList;

public class Point3D extends Point2D {

    private Float z;

    public Point3D(Float x, Float y, Float z) {
        super(x, y);
        this.z = z;
    }

    public Float getZ() {
        return z;
    }

    public ArrayList<Float> getXYZ() {
        ArrayList<Float> list = new ArrayList<>();
        list.add(super.getX());
        list.add(super.getY());
        list.add(z);

        return list;
    }

    public void setZ(Float z) {
        this.z = z;
    }

    public void setXYZ(Float x, Float y, Float z) {
        this.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + z + ")";
    }
}

package pl.sda.java.adv.school;

import pl.sda.java.adv.school.model.GradeWeight;

public class MainEnums {
    public static void main(String[] args) {

        System.out.println("\nEnum string representation");
        System.out.println(GradeWeight.EGZ.toString()); //toString() (or name() if not overridden)
        System.out.println(GradeWeight.EGZ); //toString() (or name() if not overridden)
        System.out.println(GradeWeight.EGZ.name()); //always exact name of enum

        System.out.println("\nEnum from string (by name)");
        GradeWeight gradeWeight = GradeWeight.valueOf("EGZ");
        System.out.println(gradeWeight == GradeWeight.EGZ);

        System.out.println("\nEnum switch");

        GradeWeight switchGw = GradeWeight.PYT;
        final int x;
        switch (switchGw) {
            case EGZ: {
                x = 0;
                break;
            }
            case AKT: {
                x = 1;
                break;
            }
            case PYT: {
                x = 2;
                break;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }

        System.out.println("X = " + x);

    }
}

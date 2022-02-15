package pl.sda.java.adv.school;

import pl.sda.java.adv.school.model.Person;
import pl.sda.java.adv.school.model.Student;
import pl.sda.java.adv.school.util.CsvStudentsLoader;

public class MainEqualityAndReferences {
    public static void main(String[] args) {
        System.out.println("\nLet's compare students");

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = student1;
        Object student4 = student1;

        System.out.println(student1 == student2); //false (different reference)
        System.out.println(student1 == student3); //true (different variable, same object)
        System.out.println(student2 == student3); //false (different reference)

        System.out.println("\nLet's see instanceof");
        System.out.println(student4 instanceof Student);
        System.out.println(student4 instanceof Person);
        System.out.println(student4 instanceof Object);
        System.out.println(student4 instanceof CsvStudentsLoader);

        System.out.println("\nLet's compare integers");

        int int100 = 100;
        int int500 = 500;
        Integer integer100a = 100;
        Integer integer500a = 500;
        Integer integer100b = 100;
        Integer integer500b = 500;

        System.out.println(int100 == integer100a); //true, because integer wrapper object is unboxed
        System.out.println(int500 == integer500a); //true, because ditto
        System.out.println(integer100a == integer100b); //true, because value is cached (see Integer.valueOf(...))
        System.out.println(integer500a == integer500b); //false, because they are different objects with different references
        System.out.println(integer100a.equals(integer100b));
        System.out.println(integer500a.equals(integer500b));

        // Integer implementation of equals, instanceof operator checks object is instance of given type

//        public boolean equals(Object obj) {
//            if (obj instanceof Integer) {
//                return value == ((Integer)obj).intValue();
//            }
//            return false;
//        }

        System.out.println("\nLet's compare strings");

        String string1 = "abcd";
        String string2 = "abcd";
        String string3 = string1;
        String string4 = new String("abcd");

        System.out.println(string1 == string2); //true, because of string pool (so instance is same)
        System.out.println(string1 == string3); //true, because it's the same instance
        System.out.println(string2 == string3); //true, because of string pool (so instance is same)
        System.out.println(string1 == string4); //false, because object is different
        System.out.println(string1.equals(string4)); //true, because there is an implementation of equals in String

        //hashCode is NOT UNIQUE (although well written hashCode() method will result in few collisions)
        //if objects have SAME hashCode, they MIGHT BE equal
        //if objects have DIFFERENT hashCode, they CAN NEVER BE equal
    }
}

/*
Write a function that will take a collection of integer numbers and a number to check. The function should return true if the number is present in the collection and false if it is not present e.g.
boolean contains(Collection collection, int number)
Do not use the standard methods that are doing this operation e.g. contains(Object o) from Collection
*/

package algorithms;

import java.util.Collection;
import java.util.List;

public class AlgorithmsExercises {

    public static void main(String[] args) {
        System.out.println(contains(List.of(1, 3, 4, 5), 4));
    }

    public static boolean contains(Collection collection, int number) {
        for (Object object : collection) {
            if (object.equals(number))
                return true;
        }
        return false;
    }
}

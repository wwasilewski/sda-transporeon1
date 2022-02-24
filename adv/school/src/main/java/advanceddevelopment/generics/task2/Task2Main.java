package advanceddevelopment.generics.task2;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task2Main {

    public static void main(String[] args) {
        String[] array = {"string1", "string2", "string3", "string2"};

        int counter = countIf(array, value -> value.equals("string2"));
        System.out.println(counter);
    }

    public static <T> int countIf(T[] array, Validator<T> validator) {
        int counter = 0;

        for (T element : array) {
            if (validator.validate(element)) {
                counter++;
            }
        }
        return counter;
    }

    public static <T> int countI2(T[] array, Predicate<T> validator) {
        return (int) Arrays.stream(array)
                .filter(validator)
                .count();
    }
}

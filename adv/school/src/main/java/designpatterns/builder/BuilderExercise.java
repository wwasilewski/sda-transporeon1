/*
Create list with numbers from 1 do 10.
Create method String commaSeparate(List<Integer> numbers), that will return numbers from list separated by comma
Create additional version of the method e.g. commaSeparate1, commaSeparate2 etc.
Which version will you take as a final implementation?
*/

package designpatterns.builder;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class BuilderExercise {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(commaSeparate(numbers));
        System.out.println(commaSeparate2(numbers));
    }

    public static String commaSeparate(List<Integer> numbers) {
        return numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
    }

    public static String commaSeparate2(List<Integer> numbers) {
        StringJoiner sj = new StringJoiner(",");

        for (Integer number : numbers) {
            sj.add(String.valueOf(number));
        }
        return sj.toString();
    }
}

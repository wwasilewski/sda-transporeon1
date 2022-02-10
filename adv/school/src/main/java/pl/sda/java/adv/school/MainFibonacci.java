package pl.sda.java.adv.school;

import java.util.stream.StreamSupport;

public class MainFibonacci {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();

        System.out.println("\nLet's use Fibonacci instance as iterable in for-each");
        int counter = 0; //Fibonacci sequence is infinite, hence the counter
        for(Long value : fib) {
            counter++;
            System.out.println(value);
            if (counter >= 15) {
                break;
            }
        }

        System.out.println("\nLet's stream Fibonacci values using spliterator");
        StreamSupport.stream(fib.spliterator(), false)
                .skip(5) //skip the first 5
                .limit(15) //take the next 15 (and no more)
                .forEach(System.out::println);
    }
}

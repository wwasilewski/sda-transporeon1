package algorithms;

public class FibonacciNumber {

    public static void main(String[] args) {

    }

    public int fibonacciNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        } else if (number == 0 || number == 1) {
            return number;
        }
        return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
    }
}

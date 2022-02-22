package pl.sda.java.adv.school;

import algorithms.FibonacciNumber;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class FibonacciNumberTest {

    FibonacciNumber fibonacciNumber = new FibonacciNumber();

    @Test
    public void fibonacciNumberCorrect() {
        int result1 = fibonacciNumber.fibonacciNumber(4);
        int result2 = fibonacciNumber.fibonacciNumber(6);

        assertThat(result1).isEqualTo(3);
        assertThat(result2).isEqualTo(8);
    }

    @Test
    public void fibonacciNumberInCorrect() {
        int result1 = fibonacciNumber.fibonacciNumber(3);
        int result2 = fibonacciNumber.fibonacciNumber(4);

        assertThat(result1).isNotEqualTo(6);
        assertThat(result2).isNotEqualTo(6);
    }

    @Test()
    void fibonacciNumberIsNegative() {
        assertThatThrownBy(() -> fibonacciNumber.fibonacciNumber(-1)).isInstanceOf(IllegalArgumentException.class);
    }
}

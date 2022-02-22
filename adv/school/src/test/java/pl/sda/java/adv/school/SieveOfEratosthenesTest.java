package pl.sda.java.adv.school;

import algorithms.SieveOfEratosthenes;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SieveOfEratosthenesTest {

    SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();

    @Test
    public void isSieveCorrect() {

        int[] result = sieveOfEratosthenes.sieve(10);

        Assertions.assertThat(result).isEqualTo(new int[]{2, 3, 5, 7});
    }

    @Test
    public void isSieveInCorrect() {

        int[] result = sieveOfEratosthenes.sieve(10);

        Assertions.assertThat(result).isNotEqualTo(new int[]{2, 3, 6, 7});
    }
}
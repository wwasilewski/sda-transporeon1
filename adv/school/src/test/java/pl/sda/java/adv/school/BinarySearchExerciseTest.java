package pl.sda.java.adv.school;

import algorithms.BinarySearchExercise;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchExerciseTest {

    @Test
    void shouldFindElement() {
        BinarySearchExercise binarySearchExercise = new BinarySearchExercise();

        boolean result = binarySearchExercise.contains(new int[]{1, 2, 3, 4, 5}, 4);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    void shouldNotFindElement() {
        BinarySearchExercise binarySearchExercise = new BinarySearchExercise();

        boolean result = binarySearchExercise.contains(new int[]{1, 2, 3, 4, 5}, 8);

        Assertions.assertThat(result).isFalse();
    }
}

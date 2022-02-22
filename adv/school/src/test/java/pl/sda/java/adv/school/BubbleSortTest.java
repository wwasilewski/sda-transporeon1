package pl.sda.java.adv.school;

import algorithms.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    void checkIfBubbleSortIsCorrect() {
        //given
        int[] array = new int[]{1, 5, 2, 3, 4};

        //when
        int[] result = bubbleSort.sort(array);

        //then
        assertThat(result).isEqualTo(new int[]{1, 2, 3, 4, 5});

    }

    @Test
    void checkIfBubbleSortIsInCorrect() {
        //given
        int[] array = new int[]{1, 5, 2, 3, 4};

        //when
        int[] result = bubbleSort.sort(array);

        //then
        assertThat(result).isNotEqualTo(new int[]{1, 3, 1, 4, 5});
    }
}

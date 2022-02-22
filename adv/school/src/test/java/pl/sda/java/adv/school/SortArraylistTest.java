package pl.sda.java.adv.school;

import algorithms.SortArraylist;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SortArraylistTest {

    SortArraylist sortArraylist = new SortArraylist();

    @Test
    void checkIfSortingIsCorrect() {
        //given
        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 4, 5, 2));

        //when
        List<Integer> result = sortArraylist.sort(numbers);

        //then
        assertThat(result).isEqualTo(List.of(1, 2, 3, 4, 5));
    }

    @Test
    void checkIfSortingIsInCorrect() {
        //given
        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 4, 5, 2));

        //when
        List<Integer> result = sortArraylist.sort(numbers);

        //then
        assertThat(result).isNotEqualTo(List.of(1, 3, 2, 4, 5));
    }
}

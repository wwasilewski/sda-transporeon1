package designpatterns.decorator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListTest {

    @Test
    void shouldNotAcceptNewElement() {
        List<String> list = new ArrayList<>();
        list.add("abc");

        List<String> unmodifiableList = Collections.unmodifiableList(list);

        Assertions.assertThatThrownBy(() -> unmodifiableList.add("123"))
                .isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    void shouldNotAcceptElementOfWrongType() {
        List<String> list = new ArrayList<>();
        list.add("abc");

        List<String> checkedList = Collections.checkedList(list, String.class);

        Assertions.assertThatThrownBy(() -> {
            List listWithoutType = checkedList;
            listWithoutType.add(1);

        }).isInstanceOf(ClassCastException.class);
    }
}

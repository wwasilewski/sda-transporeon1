package designpatterns.chainofresponsibility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ChainTest {

    ChainElement chain = Chain.getChainElement();

    @Test
    void shouldFilterNull() {
        boolean result = chain.shouldBeFiltered(null);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    void shouldFilterEmpty() {
        boolean result = chain.shouldBeFiltered("");

        Assertions.assertThat(result).isTrue();
    }

    @Test
    void shouldFilterLongerThan20Chars() {
        boolean result = chain.shouldBeFiltered("123456789012345678901");

        Assertions.assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseIfFilterOk() {
        boolean result = chain.shouldBeFiltered("string");

        Assertions.assertThat(result).isFalse();
    }

    @Test
    void shouldReturnTrueIfStringHas20Characters() {
        boolean result = chain.shouldBeFiltered("012345678901234567890");

        Assertions.assertThat(result).isTrue();
    }


}

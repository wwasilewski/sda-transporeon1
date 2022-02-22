package designpatterns.chainofresponsibility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ChainAndResponsibilityExTest {

    ChainAndResponsibilityEx ex = new ChainAndResponsibilityEx();

    @Test
    void shouldReturnTrueIfStringNull() {
        boolean result = ex.stringFilter(null);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    void shouldReturnTrueIfStringEmpty() {
        boolean result = ex.stringFilter("");

        Assertions.assertThat(result).isTrue();
    }

    @Test
    void shouldReturnTrueIfStringLongerThan20Characters() {
        boolean result = ex.stringFilter("longlonglongTestString");

        Assertions.assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseIfFilterOk() {
        boolean result = ex.stringFilter("string");

        Assertions.assertThat(result).isFalse();
    }

    @Test
    void shouldReturnTrueIfStringHas20Characters() {
        boolean result = ex.stringFilter("012345678901234567890");

        Assertions.assertThat(result).isTrue();
    }
}

package designpatterns.flyweight;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FlyweightExerciseTest {

    @Test
    void shouldBeEqual() {
        Integer i1 = Integer.valueOf(127);
        Integer i2 = Integer.valueOf(127);

        Assertions.assertThat(i1).isEqualTo(i2);
        Assertions.assertThat(i1).isSameAs(i2);
    }

    @Test
    void shouldNotBeEqual() {
        Integer i3 = new Integer(10);
        Integer i4 = new Integer(10);

        Assertions.assertThat(i3).isEqualTo(i4);
        Assertions.assertThat(i3).isNotSameAs(i4);
    }
}

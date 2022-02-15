package pl.sda.java.adv.school.util;

import pl.sda.java.adv.school.model.Grade;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Optional;

public class GradeUtils {
    private GradeUtils() {
        throw new UnsupportedOperationException();
    }

    public static Optional<BigDecimal> gradesAverage(Collection<Grade> grades) {
        return Optional.empty();
    }
}

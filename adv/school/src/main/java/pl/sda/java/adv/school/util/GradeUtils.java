package pl.sda.java.adv.school.util;

import pl.sda.java.adv.school.model.Grade;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.Optional;

public class GradeUtils {
    private GradeUtils() {
        throw new UnsupportedOperationException();
    }

    public static Optional<BigDecimal> gradesAverage(Collection<Grade> grades) {
        BigDecimal sumOfGrades = grades.stream()
                .map(t -> t.getValue().multiply(t.getGradeWeight().getValue()))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal sumOfWeightFactors = grades.stream()
                .map(t -> t.getGradeWeight().getValue())
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        if (sumOfGrades.compareTo(BigDecimal.ONE) < 0 || sumOfWeightFactors.compareTo(BigDecimal.ZERO) <= 0) {
            return Optional.empty();
        }

        return Optional.of(sumOfGrades.divide(sumOfWeightFactors, 2, RoundingMode.HALF_UP));
    }
}

package pl.sda.java.adv.school.model;

import java.math.BigDecimal;

public enum GradeWeight {
    EGZ(new BigDecimal("2")),
    PYT(new BigDecimal("1.5")),
    AKT(new BigDecimal("1.0"));

    private final BigDecimal value;

    GradeWeight(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "GradeWeight."+name()+"{" +
                "value=" + value +
                "} " + super.toString();
    }
}

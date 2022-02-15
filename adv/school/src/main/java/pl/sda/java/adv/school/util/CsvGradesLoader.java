package pl.sda.java.adv.school.util;

import pl.sda.java.adv.school.model.Grade;
import pl.sda.java.adv.school.model.GradeWeight;

import java.math.BigDecimal;
import java.util.Optional;

public class CsvGradesLoader extends AbstractCsvLoader<Grade> {


    @Override
    protected Optional<Grade> parseLine(String value) {
        String[] splat = value.replaceAll("\"", "").split(",");
        if (value.length() < 4) {
            return Optional.empty();
        }
        try {
            Grade grade = new Grade();
            grade.setStudentId(splat[0]);
            grade.setSubjectCode(splat[1]);
            grade.setGradeWeight(GradeWeight.valueOf(splat[2]));
            grade.setValue(new BigDecimal(splat[3]));
            return Optional.of(grade);
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }

    }
}

package pl.sda.java.adv.school;

import pl.sda.java.adv.school.model.Grade;
import pl.sda.java.adv.school.util.GradeUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GradeService {
    private final List<Grade> grades;

    public GradeService(List<Grade> grades) {
        this.grades = grades;
    }

    public Map<String, BigDecimal> averagePerStudentId() {

        return grades.stream().collect(Collectors.groupingBy(Grade::getStudentId,
                Collectors.collectingAndThen(
                        Collectors.toList(),
                        studentGrades -> GradeUtils.gradesAverage(studentGrades).orElse(null)
                )));
    }
}

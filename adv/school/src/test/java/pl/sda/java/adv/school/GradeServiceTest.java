package pl.sda.java.adv.school;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.sda.java.adv.school.model.Grade;
import pl.sda.java.adv.school.util.CsvGradesLoader;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


class GradeServiceTest {

    private GradeService gradeService;

    @BeforeEach
    void setUp() throws IOException {
        final CsvGradesLoader csvGradesLoader = new CsvGradesLoader();
        final List<Grade> grades;
        try (final InputStream inputStream = GradeServiceTest.class.getResourceAsStream("/csv/grades.csv")) {
            grades = csvGradesLoader.loadData(inputStream);
        }
        gradeService = new GradeService(grades);
    }

    @Test
    void averagePerStudentId() {
        //WHEN
        Map<String, BigDecimal> result = gradeService.averagePerStudentId();

        //THEN
        assertThat(result.get("00001003")).isEqualByComparingTo("2.68");

    }
}
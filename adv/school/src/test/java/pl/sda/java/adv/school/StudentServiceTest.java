package pl.sda.java.adv.school;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.sda.java.adv.school.model.Student;
import pl.sda.java.adv.school.util.CsvStudentsLoader;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

class StudentServiceTest {
    private StudentService studentService;

    @BeforeEach
    void setUp() throws IOException {
        final CsvStudentsLoader csvStudentsLoader = new CsvStudentsLoader();
        final List<Student> students;

        try (final InputStream inputStream = StudentServiceTest.class.getResourceAsStream("/csv/students.csv")) {
            students = csvStudentsLoader.loadData(inputStream);
        }

        studentService = new StudentService(students);
    }

    @Test
    void testGetStudentIdToStudentMap() {
        //WHEN
        final Map<String, Student> map = studentService.getStudentIdToStudentMap();

        //THEN
        Student student1 = map.get("00001001");
        assertThat(student1).isNotNull();
        assertThat(student1.getLastName()).isEqualTo("Kowalski");
    }

    @Test
    void testGetCityToStudentsMap() {
        //WHEN
        final Map<String,List<Student>> map = studentService.getCityToStudentsMap();

        //THEN
        assertThat(map.get("Krzeszowice"))
            .hasSize(2)
            .extracting(Student::getId)
            .containsExactlyInAnyOrder("00001003","00001007");
    }
    @Test
    void getStudentsSortedByAgeDesc() {
        //WHEN
        var students = studentService.getByAgeDesc();

        //THEN
        assertThat(students).extracting(Student::getId)
                .containsExactly(
                        "00002003",
                        "00002001",
                        "00002004",
                        "00002002",
                        "00002005",
                        "00001008",
                        "00001003",
                        "00001004",
                        "00001298",
                        "00001001",
                        "00001002",
                        "00001006",
                        "00001007",
                        "00001005",
                        "00001009"
                );
    }

    @Test
    void getStudentsSortedByAgeAsc() {
        //WHEN
        var students = studentService.getByAgeAscending();

        //THEN
        assertThat(students).extracting(Student::getId)
                .containsExactly(
                        "00001009",
                        "00001005",
                        "00001007",
                        "00001006",
                        "00001002",
                        "00001001",
                        "00001298",
                        "00001004",
                        "00001003",
                        "00001008",
                        "00002005",
                        "00002002",
                        "00002004",
                        "00002001",
                        "00002003"
                );
    }
}

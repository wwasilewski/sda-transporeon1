package pl.sda.java.adv.school;

import pl.sda.java.adv.school.model.Student;
import pl.sda.java.adv.school.util.CsvStudentsLoader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class MainStudentsLoader {
    public static void main(String[] args) {
        CsvStudentsLoader csvStudentsLoader = new CsvStudentsLoader();
        List<Student> students;
        try (InputStream inputStream = Files.newInputStream(Path.of("example/students.csv"))) {
            students = csvStudentsLoader.loadData(inputStream);
        } catch (IOException e) {
            students = Collections.emptyList();
            e.printStackTrace();
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

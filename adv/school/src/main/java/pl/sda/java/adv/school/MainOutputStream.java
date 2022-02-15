package pl.sda.java.adv.school;

import pl.sda.java.adv.school.model.Student;
import pl.sda.java.adv.school.util.CsvStudentsLoader;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class MainOutputStream {
    public static void main(String[] args) throws IOException {
        final CsvStudentsLoader csvStudentsLoader = new CsvStudentsLoader();
        final List<Student> students;

        System.out.println("Readable: " + Files.isReadable(Path.of("example/students.csv")));
        try (final InputStream inputStream = Files.newInputStream(Path.of("example/students.csv"))) {
            students = csvStudentsLoader.loadData(inputStream);
        }

        StudentService studentService = new StudentService(students);

        System.out.println("Writable: " + Files.isWritable(Path.of("example/repeated.txt")));
        try (final OutputStream outputStream = Files.newOutputStream(Path.of("example/repeated.txt"))) {
//        try (final OutputStream outputStream = Files.newOutputStream(Path.of("example/repeated.txt"), StandardOpenOption.CREATE_NEW)) {
//        try (final OutputStream outputStream = Files.newOutputStream(Path.of("example/repeated.txt"), StandardOpenOption.APPEND)) {
            PrintStream printStream = new PrintStream(outputStream);
            studentService.getStudentsWhichRepeatedAYear().forEach(printStream::println);
        }
    }
}

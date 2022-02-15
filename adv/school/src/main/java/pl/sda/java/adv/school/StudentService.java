package pl.sda.java.adv.school;

import pl.sda.java.adv.school.model.Person;
import pl.sda.java.adv.school.model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class StudentService {
    private final List<Student> students;

    public StudentService(List<Student> students) {
        this.students = students;
    }

    public Map<String, Student> getStudentIdToStudentMap() {
//        final Map<String,Student> studentIdToStudentMap = new HashMap<>();
//        for (Student student : students) {
//            studentIdToStudentMap.put(student.getId(), student);
//        }
//
//        return Collections.unmodifiableMap(studentIdToStudentMap);

        return students.stream()
                .collect(Collectors.toUnmodifiableMap(
                        Student::getId, // student -> student.getId()
                        student -> student // Function.identity()
                ));
    }

    public Map<String, List<Student>> getCityToStudentsMap() {
//        final Map<String,List<Student>> cityToStudentsMap = new HashMap<>();
//        for (Student student : students) {
//            final String city = student.getAddress().getCity();
//            List<Student> studentsFromCity = cityToStudentsMap.get(city);
//            if (studentsFromCity == null) {
//                studentsFromCity = new LinkedList<>();
//                cityToStudentsMap.put(city, studentsFromCity);
//            }
//
//            studentsFromCity.add(student);
//        }
//
//        return cityToStudentsMap;


//        final Map<String,List<Student>> cityToStudentsMap = new HashMap<>();
//        for (Student student : students) {
//            final String city = student.getAddress().getCity();
//            List<Student> studentsFromCity = cityToStudentsMap.computeIfAbsent(city, c -> new LinkedList<>());
//            studentsFromCity.add(student);
//        }
//
//        return cityToStudentsMap;

        return students.stream()
                .collect(Collectors.groupingBy(student -> student.getAddress().getCity()));
    }

    public List<Student> getByAgeAscending() {

        return students.stream()
                .sorted(Comparator.comparing(Person::getBirthDate).reversed())
                .collect(Collectors.toList());
    }


    public List<Student> getByAgeDesc() {
        return students.stream()
                .sorted(Comparator.comparing(Person::getBirthDate))
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsByCityAndLastName() {
        return students.stream()
                .sorted(Comparator.comparing(s1 -> s1.getAddress().getCity() + s1.getLastName()))
                .collect(Collectors.toList());

    }

    public List<Student> getStudentsByYearSortedByLastAndFirstName(byte schoolYear) {
        return students.stream()
                .filter(s1 -> s1.getSchoolYear() == schoolYear)
                .sorted(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName))
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsWhoRepeatedAYear() {
        return students.stream()
                .filter(s1 -> (s1.getStartYear() + s1.getSchoolYear()) < 2022)
                .collect(Collectors.toList());
    }

    public Map<String, Student> getOldestStudentFromEachCity() {
//        return students.stream()
//                .collect(Collectors.groupingBy(s1 -> s1.getAddress().getCity(),
//                        Collectors.minBy(Comparator.comparing(Student::getBirthDate))));
        return students.stream()
                .collect(Collectors.toUnmodifiableMap(
                        s1 -> s1.getAddress().getCity(),
                        s1 -> s1,
                        (s1, s2) -> {
                            if (s1.getBirthDate().isBefore(s2.getBirthDate())) {
                                return s1;
                            }
                            return s2;
                        }
                ));
    }

    public double getRatioOfStudentsNotFrom(String city) {
        return students.stream()
                .filter(s1 -> !s1.getAddress().getCity().equals(city))
                .count() * 100d / students.size();
    }
}

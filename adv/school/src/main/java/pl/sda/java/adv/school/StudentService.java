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

    public List<Student> getStudentsSortedByCityAndLastName() {
        Comparator<Student> cityComparator = Comparator.comparing(student -> student.getAddress().getCity());

        return students.stream()
                //.sorted(Comparator.comparing((Function<Student,String>)student -> student.getAddress().getCity())
                .sorted(cityComparator.thenComparing(Student::getLastName))
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsByYearSortedByLastAndFirstName(byte schoolYear) {
        return students.stream()
                .filter(s -> s.getSchoolYear() == schoolYear)
                .sorted(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName))
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsWhichRepeatedAYear() {
        return students.stream()
                .filter(this::hasRepeatedYear)
                .collect(Collectors.toList());
    }
    private boolean hasRepeatedYear(Student student) {
        int yearsOfEducation = 2022 - student.getStartYear();
        return yearsOfEducation > student.getSchoolYear();
    }

    public Map<String, Student> getOldestStudentFromEachCity() {
//        return students.stream()
//                .collect(Collectors.groupingBy(student -> student.getAddress().getCity(),
//                        Collectors.minBy(Comparator.comparing(Student::getBirthDate))))
//                .values()
//                .stream()
//                .map(Optional::get)
//                .collect(Collectors.toUnmodifiableMap(
//                        student -> student.getAddress().getCity(),
//                        Function.identity()
//                ));
        return students.stream()
                .collect(Collectors.toUnmodifiableMap(
                        student -> student.getAddress().getCity(),
                        student -> student,
                        (student1, student2) -> {
                            if (student1.getBirthDate().isBefore(student2.getBirthDate())) {
                                return student1;
                            }
                            return student2;
                        }
                ));

    }

    public double getRatioOfStudentsNotFrom(String city) {
        long numberOfStudentsNotFromCity = students.stream()
                .filter(student -> !student.getAddress().getCity().equals(city))
                .count();

        return numberOfStudentsNotFromCity * 100.0 / students.size();
    }

}


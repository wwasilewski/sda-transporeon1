package algorithms;

import java.util.HashSet;
import java.util.Set;

public class PersonMain {
    public static void main(String[] args) {

        Set<Person> persons = new HashSet<>();
        persons.add(new Person(1, "Johny"));
        persons.add(new Person(1, "Johny"));
        persons.add(new Person(2, "Ann"));

        System.out.println(persons);
        System.out.println(persons.size());
    }
}

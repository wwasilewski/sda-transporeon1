package pl.sda.java.adv.school.model;

import java.time.LocalDate;
import java.util.Set;

public class Teacher implements Comparable<Teacher>{

    private String id;
    private String firstName;
    private String lastName;
    private Set<String> classTypes;
    private LocalDate birthdate;
    private Address address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<String> getClassTypes() {
        return classTypes;
    }

    public void setClassTypes(Set<String> classTypes) {
        this.classTypes = classTypes;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", classTypes=" + classTypes +
                ", birthdate=" + birthdate +
                ", address=" + address +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        int lastNameResult = lastName.compareTo(o.lastName);

        if (lastNameResult == 0) {
            return firstName.compareTo(o.firstName);
        }
        return lastNameResult;
    }
}

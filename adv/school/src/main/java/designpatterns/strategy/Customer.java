package designpatterns.strategy;

public class Customer {

    private String firstName;
    private String phoneNumber;
    private String email;
    private String preferredContact;

    public Customer(String firstName, String phoneNumber, String email, String preferredContact) {
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.preferredContact = preferredContact;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPreferredContact() {
        return preferredContact;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", preferredContact='" + preferredContact + '\'' +
                '}';
    }
}

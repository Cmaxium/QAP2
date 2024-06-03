// Person.java
public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    // Constructor
    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // toString method
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + address;
    }
}

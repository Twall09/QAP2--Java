
public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    public String toString() {
        return firstName + " " + lastName + ", Address: " + home.toString();
    }

}

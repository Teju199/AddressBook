package AddressBook;

import java.util.Objects;

public class Person {

    //Overriding the equals method to compare the attributes inside the object with the attributes of other object.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return null;
    }

    //Instance variables
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String zip;
    private String phoneNumber;
    private String email;

    //Constructor for Person
    public Person(String firstName, String lastName, String address, String city, String zip,
                  String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "FirstName : " + this.firstName + " " + "LastName : " + this.lastName + " " + "Address : " + this.address + " " + " " + "City : " + this.city + " "  + "zipcode : " + this.zip + " " +
                "phoneNumber : " + this.phoneNumber + " " + "Email : " + this.email;
    }
}

package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookEditContact {
    public static void main(String[] args) {

        //ArrayList created for addressBook
        ArrayList<Person> addressBook = new ArrayList();

        //person1 object created and the information provided for all the attributes.
        Person person1 = new Person("Ram", "Sundar", "J.P Nagar", "Bangalore", "560078", "9807654767", "ram@gmail.com");
        addressBook.add(person1);
        Person person2 = userInput();
        addressBook.add(person2);

        printAddressBook(addressBook);

        System.out.println("Contact in Address Book" + addressBook);

        //To update the Name in the contact List
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name that needs to be updated.");
        String name = sc.next();

        Person person = getPerson(addressBook, name);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the new name : ");
        String newName = sc1.next();

        Person updatedContact = person.setFirstName(newName);
        printAddressBook(addressBook);
        System.out.println("Updated contact : " + addressBook);

    }

    private static void printAddressBook(ArrayList<Person> addressBook) {
        for (Person person : addressBook) {
            System.out.println(person);
        }
    }

    //Taking input for all the attributes from user
    public static Person userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String firstName = sc.next();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Last Name : ");
        String lastName = sc1.next();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter address : ");
        String address = sc2.next();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter City : ");
        String city = sc3.next();

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter zipcode : ");
        String zip = sc4.next();

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Enter phone number : ");
        String phoneNumber = sc5.next();

        Scanner sc6 = new Scanner(System.in);
        System.out.println("Enter the email : ");
        String email = sc6.next();

        Person person2 = new Person(firstName, lastName, address, city, zip, phoneNumber, email);
        return person2;
    }

    // Method to check whether the Person name user entered is in the Array List.
    public static Person getPerson(ArrayList<Person> addressBook, String name) {

        for (Person person : addressBook) {
            if (person.getFirstName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        return null;
    }
}


package AddressBook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class AddressBookTotalContactsInGivenCity {
    public static void main(String[] args) {

        //ArrayList created for addressBook
        ArrayList<Person> addressBook = new ArrayList();

        //person1 object created and the information provided for all the attributes.
        Person person1 = new Person("Ram", "Sundar", "J.P Nagar", "Bangalore", "560078", "9807654767", "ram@gmail.com");
        addressBook.add(person1);
        Person person2 = userInput();
        addressBook.add(person2);

        System.out.println("Contact in Address Book" + addressBook);

        Person person3 = new Person("Emily", "Cooper", "Dollars Colony", "Bangalore", "560081", "9987654287", "emily@gmail.com");
        addressBook.add(person3);

        Person person4 = new Person("Emily", "Cooper", "Dollars Colony", "Bangalore", "560081", "9987654287", "emily@gmail.com");
        addressBook.add(person4);
        printAddressBook(addressBook);

        HashSet<Person> set = new HashSet<Person>(addressBook);
        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);

        System.out.println("Address book with hashset : " + set);

        AddressBookSearchPerson addressBookSearch = new AddressBookSearchPerson();

        Person person = searchByCity(set);
    }

    //To search the contact by city name.
    private static Person searchByCity(HashSet<Person> set) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the city name : ");
        String city = sc.next();

        for(Person person : set){
            if(person.getCity().equalsIgnoreCase(city)){
                System.out.println(person);
                count++;
            }
        }
        System.out.println("Total numbers of contacts in the city given : " + count);
        return null;
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
}

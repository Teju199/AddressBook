package AddressBook;

import java.util.ArrayList;

public class AddressBookAddContact {
    public static void main(String[] args) {

        //ArrayList created for addressBook
        ArrayList addressBook = new ArrayList();

        //person1 object created and the information provided for all the attributes.
        Person person2 = new Person("Ram", "Sundar", "J.P Nagar", "Bangalore", "560078", "9807654767", "ram@gmail.com");
        addressBook.add(person2);
        System.out.println("Contact in Address Book" + addressBook);
    }
}


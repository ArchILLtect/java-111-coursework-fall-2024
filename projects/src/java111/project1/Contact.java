/**
* Project 1 - Part 2
* 
* The contact class
*  
* @author Nick Hanson
* Created on: 09/05/24
*/
public class Contact {

    // Initialize the instance variables
    String firstName;
    String lastName;
    String address;
    String phone;
    String email;

    /**
     *  This method is used to display the contact info
     */
    void display() {
        // Display an empty line
        System.out.println();
        // Display the fullname of the contact
        System.out.println("Name: " + firstName + " " + lastName);
        // Display the address of the contact
        System.out.println("Address: " + address);
        // Display the phone number of the contact
        System.out.println("Phone: " + phone);
        // Display the email of the contact
        System.out.println("Email: " + email);
    }
}

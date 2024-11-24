/**
* 
* Project 1 - Part 2
* 
* The contact class test drive
*  
* @author Nick Hanson
* Created on: 09/05/24
* 
*/
public class ContactTestDrive {

    /**
     *  The main method for the ContactTestDrive class
     *  which will create two Contact objects and 
     *  call the display method for each.
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
        
        // Instantiates 2 new contacts
        Contact mufasa = new Contact();
        Contact simba = new Contact();

        // Set all the data in the object with the dot operator.
        mufasa.firstName = "Mufasa";
        mufasa.lastName = "the King";
        mufasa.address = "909 Pride Rock, the Pride Lands, Kenya";
        mufasa.phone = "011 254 702 637 349";
        mufasa.email = "mufasa@theking.com";

        simba.firstName = "Simba";
        simba.lastName = "the Prince";
        simba.address = "1324 Cloud Forest, the Pride Lands, Kenya";
        simba.phone = "011 254 701 059 029";
        simba.email = "princesimba@pridelands.dev";
        
        // Call the display method for each object.
        mufasa.display();
        simba.display();
        
    }
}

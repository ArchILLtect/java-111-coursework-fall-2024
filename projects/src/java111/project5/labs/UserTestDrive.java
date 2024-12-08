package java111.project5.labs;

/**
 *  This class is the "test drive" for the User class (for Unit 5 Lab 3)
 *  @author Nick Hanson
 *      - Created 12/6/24
 */
public class UserTestDrive {

    /**
     *  The main program for the UserTestDrive class. It creates 2
     * users and then displays an observation.
     *
     * @param  args  The command line arguments
     */
    public static void main(String[] args) {
        
        // Create an instance of User
        User user1 = new User();

        // Create an instance of AdminUser sub class
        AdminUser user2 = new AdminUser();

        // Print out observation
        System.out.println("The sub class calls on the constructor for it's super class as well");

    }
}

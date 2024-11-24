/**
* 
* Project 1 - Part 3
* 
* The name loop class test drive
*  
* @author Nick Hanson
* Created on: 09/09/24
* 
*/
public class NameLoopTestDrive {

    /**
     * The main method for the NameLoopTestDrive class
     * which will instantiate a new NameLoop and call on
     * the it's repeat loop method.
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
        // Instantiates a new name loop
        NameLoop firstLoop = new NameLoop();

        // Assign fullname of new object
        firstLoop.fullName = "Nick Hanson Sr.";

        // Call repeatName method on new object
        firstLoop.repeatName();
    };
}

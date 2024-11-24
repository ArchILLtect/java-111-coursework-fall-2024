/**
 * Lab 5: Arrays of Objects Part 1 - Test Drive
 *  
 * @author Nick Hanson
 * Created on: 10/05/24
 * 
 */
public class EmployeeFactoryTestDrive {

    /**
     * The main method for the EmployeeFactory class
     * Instantiates a new EmployeeFactory class and calls on the
     * setup, runWhile, and runFor loops
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
        
        // Instantiates a new EmployeeFactory class
        EmployeeFactory factory1 = new EmployeeFactory();

        
        // Calls on the methods to setup and run loops
        factory1.setup();
        factory1.runWhile();
        factory1.runFor();

    }

}

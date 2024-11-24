/**
 * Lab 5: Array of Objects Part 2 - Test Drive
 *  
 * @author Nick Hanson
 * Created on: 10/05/24
 * 
 */
public class LabFiveVariablesTestDrive {

    /**
     *  The main method for the LabFiveVariables class
     *  Instantiates a new Lab One class, calls on the run method, and displays a string
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
        
        // Instantiates a new Lab One class
        LabFiveVariables labFiveVars1 = new LabFiveVariables();
        
        // Calls on the methods to make the calculations.
        labFiveVars1.run();

        System.out.println("The instance variable named count is: " + labFiveVars1.getCount() + " (printed from the main() method)");

    }

}

/**
 * Assigment 1
 *  
 * @author Nick Hanson
 * Created on: 10/05/24
 * 
*/
public class AssignmentOne {
    
    int loop = 10;
    double adder = 12.76;
    double total = 0.0;

    /**
     *  This method adds the adder value to the total
    */
    void runLoop() {

        // While loop that runs a loop var number of times
        total = 0;
        int counter = 0;
        while (counter < loop) {
            // Each iteration adds the adder value to the total
            total = total + adder;
            counter++;
        }
        System.out.println("Adding 12.76 to a total (where the total started at 0) 10 times results in: " + total);
    }
}

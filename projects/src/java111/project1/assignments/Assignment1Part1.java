/**
 * Assignment 1 - Part 1
 *  
 * @author Nick Hanson
 * Created on: 09/03/24
 * 
 */


public class Assignment1Part1 {

    /**
     * The main method for Assignment 1 Part 1
     * which will print the value of the counter
     * however many times it is assigned in the loop.
     *
     * @param  args  The command line arguments
     */
    public static void main(String[] args) {

        // Init the loop counter
        int counter = 0;

        // Loop a set number of times displaying the counter var's value
        // each iteration
        while (counter < 7) {
            System.out.println("counter: " + counter);
            // Increment the counter
            counter++;
        };

    } 
}

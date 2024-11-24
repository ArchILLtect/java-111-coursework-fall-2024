/**
 * 
 * Assignment 1 - Part 2
 *  
 * @author Nick Hanson
 * Created on: 09/03/24
 * 
 */


public class Assignment1Part2 {

    /**
     * The main method for Assignment 1 Part 2
     * which will print messages at start, half-way through, and at the end
     * of a loop that runs 20 times. Went further to add a % updating status
     *
     * @param  args  The command line arguments
     */
    public static void main(String[] args) {

        // Init the loop counter
        int counter = 0;

        // Loop 20 times, displaying status at each iteration
        while (counter < 20) {
            // Check the value of the counter
            if (counter == 0) {
                // If loop is on first run, print message
                System.out.println("First Time!");
            } else if (counter == 9) {
                // If loop is half-way done, print message
                System.out.println("Half-way there!");
            } else if (counter == 19) {
                // If loop is finishing, print message
                System.out.println("All Done!   ");
            } else {
                /**
                 * Print a completion percentage based on counter value.
                 * A search took me to
                 * https://www.geeksforgeeks.org/formatted-output-in-java/
                 * to find how to format how completion status gets displayed.
                */
                System.out.printf("Loading: %.0f%%\r", (counter / 20.0) * 100);
            }
            // Increment the counter
            counter++;
            /** A simple search for delaying led me to:
             * https://stackoverflow.com/questions/24104313/how-do-i-make-a-delay-in-java
             * which introduced me to Thread.sleep(<ms>) which led me to:
             * https://www.geeksforgeeks.org/thread-sleep-method-in-java-with-examples/
             * with another search. Maybe not the best way, but it does the job.
            */
            try {
                // Pause (Sleep) for 0.5 sec.
                Thread.sleep(500);
            } catch (Exception e) {
                // Throw an error if there is an interruption
                e.printStackTrace();
            }
        };

    } 
}


/**
* Lab 2.1 - A Bit More Looping
* 
* The LabTwoLooping class
*  
* @author Nick Hanson
* Created on: 09/03/24
*/
public class LabTwoLooping {
    /**
     * This is the main method for this class 
     * which will loop 13 times outputting the counter and its square
     * 
     * @param args
     */
    public static void main(String[] args) {
        //Your code goes in here
        int counter = 0;

        // While loop that prints counter variable and squares it.
        while (counter < 13) {
            // Print the counter var
            System.out.print(counter);
            // Print the counter var squared and end line
            System.out.println(" " + counter*counter);
            // Increment the counter
            counter++;
        }
    }
}

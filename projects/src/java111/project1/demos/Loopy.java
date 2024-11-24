/** @author Nick Hanson
 * Created on: 09/04/24 */

/** Demonstrate adding to variables and diplaying them */
public class Loopy {
    /** The main method for the Loopy class
     * it demonstrates our first while loop in java using a counter */
    public static void main(String[] args) {
        int counter = 1;

        System.out.println("Before the Loop");

        while (counter < 4) {
            System.out.print("In the loop");
            System.out.println(" - the value of counter is " + counter);
            counter = counter + 1;
        }

        System.out.println("This is after the loop");
    }
}
/**
 *  Demonstration is/else statements and booleans
 *
 *@author    pwaite
 */
public class ConditionalDemo {
    /** Create a variable and then use if/else
     * check to perform displays of appropriate messages
     */
    public static void main(String[] args) {

        // Init the var
        int myNumber = 40;

        // Check the value of myNumber
        if (myNumber == 40) {
            // If 40 display this message
            System.out.println("The number is 40, see...." + myNumber);
        } else if (myNumber == 30) {
            // If 30 display this message
            System.out.println("The number is 30, see...." + myNumber);
        } else {
            // If not 30 --or-- 40 display this message
            System.out.println("The number is not 30 or 40. It is " + myNumber);
        }
    }
}

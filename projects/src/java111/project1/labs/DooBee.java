/**
 *  Part of Lab 2
 *
 * @author    eknapp
 */
public class DooBee {

    /**
     *  The main method for the DooBee class
     *  which will output DooBeeDooBeeDo
     *
     * @param  args  The command line arguments
     */
    public static void main(String[] args) {
        // Intitate the counter
        int  counter  = 1;
        // While loop runs until counter is greater then 2
        while (counter < 3) {
            // Print DooBee
            System.out.print("Doo");
            System.out.print("Bee");
            // Increment the counter
            counter = counter + 1;
        }
        // After loop stops, check that counter is 3
        if (counter == 3) {
            // If counter is 3 print Do
            System.out.print("Do");
        }
    }
}
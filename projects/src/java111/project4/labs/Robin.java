/**
 * Robin class represents a subclass of the Bird class (for Lab 6 of Unit 4)
 * @author Nick Hanson Sr.
 *  - Created on: November 15, 2024
 */

public class Robin extends Bird {
    // Without the abstract method, compiling give the error:
    // The type Robin must implement the inherited abstract method Bird.display()

    /** 
     * This method displays the a message to the terminal.
     */
    @Override
    public void display() {
        System.out.println("Tuk! Tuk! I'm a Robin!");
    };
    
}

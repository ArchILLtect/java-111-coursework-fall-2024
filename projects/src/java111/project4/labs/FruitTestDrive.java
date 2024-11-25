/**
 * This class is used to display the citrus classes - (for lab 3 of Unit 4)
 * @author Nick Hanson Sr.
 *  - Created on: November 20, 2024
 */

public class FruitTestDrive {
    /**
     *  The main program for the citrus (Lab3) class. It instatiates all 3 classes and
     * runs the display method on each.
     *
     * @param  args  The command line arguments
     */

     public static void main(String[] args) {
        // Instantiate a Citrus, Grapefruit and RubyRedGrapefruit class
        Citrus citrus = new Citrus();
        Grapefruit grapefruit = new Grapefruit();
        RubyRedGrapefruit rubyRed = new RubyRedGrapefruit();

        System.out.println();
        System.out.println("Here are my citrus classes:");

        // Class display() on all new citrus objects
        citrus.display();
        grapefruit.display();
        rubyRed.display();
    }
    
}

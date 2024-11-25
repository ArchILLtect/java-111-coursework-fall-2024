/**
 * This class is used to display the fruit classes as super classes only (Lab 4 Unit 4)
 * @author Nick Hanson Sr.
 *  - Created on: November 20, 2024
 */

public class FruityTestDrive {
    /**
     *  The main program for the Fruit (Lab4) classes. It instatiates all 3 classes and
     * runs the display method on each.
     *
     * @param  args  The command line arguments
     */

     public static void main(String[] args) {
        // Instantiate a Citrus, Grapefruit and RubyRedGrapefruit class
        Citrus citrus = new Citrus();
        Citrus grapefruit = new Grapefruit();
        Citrus rubyRed = new RubyRedGrapefruit();

        System.out.println();
        System.out.println("Here are my fruit classes:");

        // Call the display method on each new citrus object
        citrus.display();
        grapefruit.display();
        rubyRed.display();

        //grapefruit.peel();
        //rubyRed.eat();

        System.out.println();
        System.out.println("I recieved the 'error: cannot find symbol' error messages because");
        System.out.println("the methods being called on are not accessible when a class's type");
        System.out.println("is declared as one of it's own superclasses - only the methods");
        System.out.println("defined in the chosen superclass are available");
    }
}

/**
 * Attempts to instantiate subclass and call on it's method (for Lab 5 of Unit 4)
 * @author Nick Hanson Sr.
 *  - Created on: November 15, 2024
 */

public class AnimalTestDrive {
    /**
     *  The main program for the Animal class
     *
     * @param  args  The command line arguments
     */
    public static void main(String[] args) {
        // Instantiate an object from Animal class
        // Animal animal = new Animal(); // Animal is abstract. Cannot be instantiated.

        Animal cat = new Cat();

        System.out.println();
        System.out.println("Calling the display method on a subclass of Animal:");
        System.out.println();
        cat.display();

    }
}

/**
 * Instantiates and run CitrusBlender (for Assignment 1 of Unit 4)
 * @author Nick Hanson Sr.
 *  - Created on: November 22, 2024
 */

public class FruitBasketTestDrive {
    /** The main program for the FruitBasketTestDrive (Assigment 1) class. It instatiates a
     *  CitrusBasket object and runs the class's methods on it.
     *
     * @param  args  The command line arguments
     */

    public static void main(String[] args) {
        //Instantiate a new CitrusBasket object.
        CitrusBasket basket = new CitrusBasket();

        // Add a blank line for clarity
        System.out.println();

        // Run each CitrusBasket method on the new object instance of the class
        basket.createCitrus();
        basket.displayCitrus();
        basket.blendCitrus();

    }


}

package java111.project5;

/**
 * The PizzaDriver class serves as an entry point
 * <p>This class is part of Project 5 - Part 1</p>
 * 
 * <p>Commands to compile and run the app:</p>
 * <p>Starting point: projects folder</p>
 * <ul>
 *     <li>To compile: {@code comp5 project5 *}
 *     <li>To run: {@code run5 project5 PizzaDriver}
 * </ul>
 * 
 * @author Nick Hanson
 * @version 1.0
 * @since 12/7/24
 */
public class PizzaDriver {

    /** 
     * The main method serves as the entry point for the app.
     * It creates an instance of {@code SelectPizza} and calls the
     * {@code processSelection()} method on it.
     * @param args command-line arguments (not used in this application)
     * @throws Exception if an error occurs during the pizza selection process
    */
    public static void main(String[] args)
            throws Exception {

        // Create new SelectPizza object
        SelectPizza  thisPizza  = new SelectPizza();

        // Run the processSelection method on the new object
        thisPizza.processSelection();
    }
}

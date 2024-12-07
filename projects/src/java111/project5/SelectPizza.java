package java111.project5;

/**
 * The {@code SelectPizza} class creates a pizza based on user input
 * <p>For Project 5 - Part 1</p>
 * @author Nick Hanson
 * @version 1.0
 * @since 12/7/24
 */
public class SelectPizza {

    /**
     * Prompts the user to select a pizza size and creates a
     * {@code PizzaChoice} object based on user's selection.
     * <p>This class is part of Project 5 - Part 1</p>
     * <p>Valid options are:
     *   <ul>
     *     <li>1 - Small</li>
     *     <li>2 - Medium</li>
     *     <li>3 - Large</li>
     *     <li>4 - XLarge</li>
     *   </ul>
     * </p>
     * @throws Exception if an error occurs during input or processing
     */
    public void processSelection() throws Exception {
        char selection;
        String choice = "";
        int index = 0;

        // Display text for prompt
        System.out.print("Select a pizza size "
                + "(Type 1 for S, 2 for M, 3 for L, 4 for X): ")
        ;

        // Read user input
        selection = (char) System.in.read();
        choice = choice + selection;

        // Convert input to int(-1 for index based)
        index = Integer.parseInt(choice) - 1;

        // Create a new PizzaChoice object
        PizzaChoice thisChoice  = new PizzaChoice(index);

        // Display the selected pizza choice
        System.out.println(thisChoice);
    }

}

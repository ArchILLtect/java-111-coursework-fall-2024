package java111.project5;
import java.text.NumberFormat;

/**
 * The {@code PizzaChoice} class allows the user to customize a pizza by
 * selecting a size.
 * <p>This class is part of Project 5 - Part 1</p>
 * @author Nick Hanson
 * @version 1.0
 * @since 12/7/24
 */
public class PizzaChoice {

    // Array of available pizza sizes
    private  char[] sizes = {'S', 'M', 'L', 'X'};
    // Array of corresponding prices per size
    private  double[] prices = {6.99, 8.99, 12.50, 15.00};
    // Formatter to achieve desired format
    private  NumberFormat formatter  = NumberFormat.getCurrencyInstance();
    // Index from user's choice
    private  int index;

    /**
     * Constructs a {@code PizzaChoice} object based on the user's choice index.
     *
     * @param choice the user's pizza size choice
     */
    public PizzaChoice(int choice) {
        index = choice;
    }

    /**
     * Returns the size of the pizza chosen by the user.
     *
     * @return the pizza size
     */
    public char getSize() {
        return sizes[index];
    }

    /**
     * Returns the price of the pizza chosen by the user.
     *
     * @return the price of the chosen pizza
     */
    public double getPrice() {
        return prices[index];
    }

    /**
     * Returns a string based on the selected pizza's price.
     *
     * @return a formatted string showing the price of the pizza
     */
    @Override
    public String toString() {
        return "The price is " + formatter.format(prices[index]);
    }

}

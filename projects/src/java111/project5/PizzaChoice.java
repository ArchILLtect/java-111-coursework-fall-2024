
import java.text.*;
import java.util.*;


public class PizzaChoice {
    private  char[] sizes = {'S', 'M', 'L', 'X'};
    private  double[] prices = {6.99, 8.99, 12.50, 15.00};
    private  NumberFormat formatter  = NumberFormat.getCurrencyInstance();
    private  int index;
    
    public PizzaChoice(int choice) {
        index = choice;
    }
    
    public char getSize() {
        return sizes[index];
    }
    
    public double getPrice() {
        return prices[index];
    }
   
    public String toString() {
        return "The price is " + ormatter.format(prices[index])
    }
}

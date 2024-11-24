/**
 * Assignment 2 - Part 1
 * 
 * This is the test drive for the Coffee Maker class
 *  
 * @author Nick Hanson
 * Created on: 09/08/24
 * 
 */
public class CoffeeMakerTestDrive {
    /**
     *  The main method for the CoffeeMakerTestDrive class
     *  which will create a coffee maker object and 
     *  call the strong and weak brewing method on it.
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
        
        // Instantiates a new coffee maker
        CoffeeMaker kuerig = new CoffeeMaker();
        
        // Calls to brew some strong coffee.
        kuerig.brewStrong();
        // Calls to brew some weak coffee.
        kuerig.brewWeak();
    }

}

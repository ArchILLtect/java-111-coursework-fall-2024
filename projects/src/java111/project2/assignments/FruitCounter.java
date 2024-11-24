/**
 * Assigment 2 - Part 2
 *  
 * @author Nick Hanson
 * Created on: 10/05/24
 * 
*/
public class FruitCounter {
    /**
     * The main method for the Fruit class
     * Creates fruit objects and sums their quantity
     *
     *@param  args  The command line arguments
    */

    // An instance variable that is an array of Fruit objects
    private Fruit[] fruits;

    // An instance variable that is an int that will hold the total fruit count
    int totalFruitQuantity = 0;

    /**
     * This method creates 6 fruit objects, sets their data,\
     * and loops through counting the total quantity of fruit
    */
    public void run() {
        
        // Initialize the instance variable array to hold 6 Fruit objects
        fruits = new Fruit[6];

        // Create 6 Fruit objects and place them in the array
        fruits[0] = new Fruit();
        fruits[1] = new Fruit();
        fruits[2] = new Fruit();
        fruits[3] = new Fruit();
        fruits[4] = new Fruit();
        fruits[5] = new Fruit();

        // Set the name and quantity for each of the 6 Fruit objects with the set methods in Fruit
        fruits[0].setFruitName("Mangos");
        fruits[0].setQuantity(7);

        fruits[1].setFruitName("Bananas");
        fruits[1].setQuantity(3);

        fruits[2].setFruitName("Drangonfruits");
        fruits[2].setQuantity(17);

        fruits[3].setFruitName("Pears");
        fruits[3].setQuantity(3);

        fruits[4].setFruitName("Tomatoes"); // Technically a fruit!
        fruits[4].setQuantity(9);

        fruits[5].setFruitName("Cucumbers"); // Also technically a fruit!
        fruits[5].setQuantity(21);

        // Loop through the array of Fruit objects and add the quantity variable from the object into the total fruit count instance variable
        for (int count = 0; count < fruits.length; count++) {
            totalFruitQuantity = totalFruitQuantity + fruits[count].getQuantity();
            System.out.println("I have " + fruits[count].getQuantity() + " " + fruits[count].getFruitName());
        }

        // Display the total count to the terminal window
        System.out.println(); // Separator line
        System.out.println("Total pieces of fruit: " + totalFruitQuantity);
    }
}

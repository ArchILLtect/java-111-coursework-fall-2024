/**
 * Lab 2: Test Dogs Part 2
 *  
 * @author Nick Hanson
 * Created on: 10/05/24
 * 
 */
public class TestDogsTwo {
    /**
     *  Another main method for the DogLabTwo class
     *  which will make two dogs bark.
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
        
        // Instantiates a new Dog class.
        DogLabTwo dog1 = new DogLabTwo();
        DogLabTwo dog2 = new DogLabTwo();
        DogLabTwo dog3 = new DogLabTwo();

        // Assigns names to the dogs.
        dog1.name = "Fido";
        dog2.name = "Spot";
        dog3.name = "Choppa";
        
        // Calls on the methods to make the dogs bark.
        dog1.bark();
        dog2.bark();
        dog3.bark();

        // Assign dog1 to dog2/dog3 to NULL and display a message about the change.
        dog2 = dog1;
        dog3 = null;
        System.out.println("After assigning dog1 to dog2 AND assigning null to the third dog:");

        // Calls on the methods to make the dogs bark again.
        dog1.bark();
        dog2.bark();
        dog3.bark();

    }
}

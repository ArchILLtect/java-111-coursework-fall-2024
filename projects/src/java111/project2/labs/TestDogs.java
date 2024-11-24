/**
 * Lab 2: Test Dogs
 *  
 * @author Nick Hanson
 * Created on: 10/05/24
 * 
 */
public class TestDogs {
    /**
     *  The main method for the DogLabTwo class
     *  which will make two dogs bark.
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
        
        // Instantiates a new Dog class.
        DogLabTwo dog1 = new DogLabTwo();
        DogLabTwo dog2 = new DogLabTwo();

        // Assigns names to the dogs.
        dog1.name = "Fido";
        dog2.name = "Spot";
        
        // Calls on the methods to make the dogs bark.
        dog1.bark();
        dog2.bark();

        // Assign dog2 as a reference to dog1 and display a message about the change.
        dog2 = dog1;
        System.out.println("After Assigning dog1 to dog2:");

        // Calls on the methods to make the dogs bark again.
        dog1.bark();
        dog2.bark();

    }
}

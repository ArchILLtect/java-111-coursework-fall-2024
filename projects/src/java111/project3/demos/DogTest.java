/** Units test the calculations in the Dog class.
*   @author Nick Hanson
*/


public class DogTest {
    /** This method wil verify the calculateFoodNeed() method works correctly
     * for a small(<50), medium(50) and large dog(>50).
     *  @param args
    */
    public static void main(String[] args) {
        // 1. Create the object that I want to test
        Dog smallDog = new Dog();

        // 2. Set relevant data on the dog. In this case weight.
        smallDog.setWeight(49);

        // 3. Create a variable for the expected results.
        int expectedFoodNeeded = 1;

        // 4. Call the method to be tested
        int actualFoodNeeded = smallDog.calculateFoodNeeded();

        // 5. Compare actual to expected and out the message
        if (expectedFoodNeeded == actualFoodNeeded) {
            System.out.println("Small dog food calculation SUCCESS!!!");
        } else {
            System.out.println("Small dog food calculation FAILED!!!");
        }

    }
}

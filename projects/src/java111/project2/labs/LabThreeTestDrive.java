/**
 * Lab 1: Number Variables
 *  
 * @author Nick Hanson
 * Created on: 10/05/24
 * 
 */
public class LabThreeTestDrive {

    /**
     * The main method for the LabThree class
     * Instantiates a new Lab One class, calls on the sayHello method 4 times,
     * calls on the sayHelloAgain method, and displays some strings
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
        
        // Instantiates a new Lab One class
        LabThree labThreeClass = new LabThree();

        System.out.println("Part 1:");
        
        // Calls on the method to say hello to provided argument
        labThreeClass.sayHello("Fred");
        labThreeClass.sayHello("Barney");
        labThreeClass.sayHello("Wilma");
        labThreeClass.sayHello("Betty");

        System.out.println("--------------");
        System.out.println("Part 2:");

        // Calls on the method to say hello to provided first argument,
        // the number of times provided by second argument
        labThreeClass.sayHelloAgain("Wilma", 5);


        int x = 18;
        int y = 4;

        double z = (double)(x / y);

        System.out.println(z);


    }

}


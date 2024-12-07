package java111.project5.labs;

/**
 *  This class is the "test drive" for the Rocket class (for Unit 5 Lab 3)
 *  @author Nick Hanson
 *      - Created 12/6/24
 */
public class RocketTestDrive {
    
    /**
     *  The main program for the RocketTestDrive class. It creates 3
     * rockets and then display each toString method.
     *
     * @param  args  The command line arguments
     */
    public static void main(String[] args) {
        
        //Instantiate 3 Rockets
        Rocket rocket1 = new Rocket();
        Rocket rocket2 = new Rocket(150);
        Rocket rocket3 = new Rocket("black");

        // Display each Rocket's toString
        System.out.println();
        System.out.println("Result from the default constructor:");
        System.out.println(rocket1.toString());
        System.out.println();
        System.out.println("Result from the default constructor:");
        System.out.println(rocket2.toString());
        System.out.println();
        System.out.println("Result from the default constructor:");
        System.out.println(rocket3.toString());
        System.out.println();
    }
}

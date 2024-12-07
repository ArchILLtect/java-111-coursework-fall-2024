package java111.project5.labs;

/**
 *  This is the MathTest class (for Unit 5 Lab 3)
 *  @author Nick Hanson
 *      - Created 12/6/24
 */
public class MathTest {
    
    /**
     *  The main program for the MathTest class. It runs static
     * methods from the Math class (utility class) to make caculations.
     *
     * @param  args  The command line arguments
     */
    public static void main(String[] args) {
        
        final int RANDOM_NUMBER = (int)(Math.PI * 10);
        final float EIGHT = (float) 8.0;
        final float NINE = 9.0f;
        final float TWENTY_ONE = 21.0f;
        final int ONE_FORTY_FOUR = 144;
        final double ROUNDER_ONE = 2.82842712475;
        final double ROUNDER_TWO = 5.91;
        final double ROUNDER_THREE = 3.14;
        final double ROUNDER_FOUR = 3.566667;

        System.out.println();
        System.out.println("My random number is " + RANDOM_NUMBER + ".");
        System.out.println();
        System.out.println("The square root of " + NINE + " is " + (Math.sqrt(NINE)) + ".");
        System.out.println("The square root of " + ONE_FORTY_FOUR
                + " is " + (Math.sqrt(ONE_FORTY_FOUR)) + ".");
        System.out.printf("The square root of %.1f is %.11f.%n", EIGHT, (Math.sqrt(EIGHT)));
        System.out.println();
        System.out.println(ROUNDER_ONE + " rounded to the nearest int is "
                + (Math.round((int)ROUNDER_ONE)) + ".");
        System.out.println(ROUNDER_TWO + " rounded to the nearest int is "
                + (Math.round((int)ROUNDER_TWO)) + ".");
        System.out.println(ROUNDER_THREE + " rounded to the nearest int is "
                + (Math.round((int)ROUNDER_THREE)) + ".");
        System.out.println(ROUNDER_FOUR + " rounded to the nearest int is "
                + (Math.round((int)ROUNDER_FOUR)) + ".");
        System.out.println();
        System.out.println(ROUNDER_ONE + " rounded to the nearest tenth is "
                + (Math.round((float)ROUNDER_ONE)) + ".");
        System.out.println(ROUNDER_TWO + " rounded to the nearest tenth is "
                + (Math.round((float)ROUNDER_TWO)) + ".");
        System.out.println(ROUNDER_THREE + " rounded to the nearest tenth is "
                + (Math.round((float)ROUNDER_THREE)) + ".");
        System.out.println(ROUNDER_FOUR + " rounded to the nearest tenth is "
                + (Math.round((float)ROUNDER_FOUR)) + ".");
        System.out.println();
        System.out.println(ROUNDER_ONE + " rounded to the nearest hundredth is "
                + (Math.round(ROUNDER_ONE)) + ".");
        System.out.println(ROUNDER_FOUR + " rounded to the nearest hundredth is "
                + (Math.round(ROUNDER_FOUR)) + ".");
        System.out.println();
        System.out.println("Pi times "+ TWENTY_ONE + " is " + (Math.PI * TWENTY_ONE) + ".");
    }
}

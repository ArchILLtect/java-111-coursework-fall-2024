/**
 * Demonstrates creating instances of subclasses of Footwear (Lab 1 of Unit 4)
 * @author Nick Hanson Sr.
 *  - Created on: November 20, 2024
 */

public class FootwearTestDrive {
    /**
     * Create some footear, set their params and call
     * the display method on them.
     */
    public static void main(String[] args) {
        // Instantiate 2 Shoe instances
        Footwear shoeOne = new Footwear();
        shoeOne.setMake("Nike");
        shoeOne.setModel("Air Jordan");
        shoeOne.setSize(12);
        shoeOne.setColor("black/gold");

        Footwear shoeTwo = new Footwear();
        shoeTwo.setMake("Adidas");
        shoeTwo.setModel("Superstar");
        shoeTwo.setSize(9);
        shoeTwo.setColor("white/black");

        // Instantiate 2 Boot instances
        Boot bootOne = new Boot();
        bootOne.setMake("Lucchese");
        bootOne.setModel("Spirit");
        bootOne.setSize(11);
        bootOne.setColor("brown");
        bootOne.setHeight(16);
        bootOne.setSpurs(true);

        Boot bootTwo = new Boot();
        bootTwo.setMake("LaCrosse");
        bootTwo.setModel("Alphaburly Pro");
        bootTwo.setSize(14);
        bootTwo.setColor("black");
        bootTwo.setHeight(18);
        bootTwo.setSpurs(false);

        // Display the Footwear
        System.out.println();
        System.out.println("Displaying Footwear:");
        shoeOne.display();
        shoeTwo.display();
        System.out.println();
        System.out.println();
        System.out.println("Displaying Boots:");
        bootOne.display();
        bootTwo.display();
        System.out.println();
    }
}

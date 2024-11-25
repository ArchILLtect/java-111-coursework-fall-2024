import java.util.*;
/**
 *  This class is for assignment 1 of Unit 4. It creates an arraylist that holds multiple
 * instances of newly created citrus objects. It also displays all citrus items and
 * "blends" them.
 *
 *  @author Nick Hanson
 *  - Created on: November 22, 2024
*/
public class CitrusBasket {

    // Instantiate a new CitrusBlender object
    CitrusBlender blender = new CitrusBlender();

    // Create an ArrayList for objects of the type Fruit
    ArrayList<Citrus> fruits;

    /** 
     * This method creates several objects of the Citrus subclasses and adds
     * them to the array list
     */
    public void createCitrus() {
        fruits = new ArrayList<Citrus>();

        Orange orange = new Orange();
        Grapefruit gf = new Grapefruit();
        RubyRedGrapefruit rrgf = new RubyRedGrapefruit();

        fruits.add(orange);
        fruits.add(gf);
        fruits.add(rrgf);
    }

    /** 
     * This method iterates through all object instances of the newly created Citrus subclasses,
     * displaying the name of each
     */
    public void displayCitrus() {
        System.out.println("The citrus basket contains:");
        for (Citrus fruit : fruits) {
            fruit.display();
        }
    }

    /** 
     * This method iterates through all object instances of the newly created Citrus subclasses,
     * "blending" each one
     */
    public void blendCitrus() {
        System.out.println();
        System.out.println("Making a smoothie:");
        for (Citrus fruit : fruits) {
            blender.blend(fruit);
        }
    }


}

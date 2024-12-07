package java111.project5.labs;

/**
 *  This class holds information about a Rocket (for Unit 5 Lab 3)
 *  @author Nick Hanson
 *      - Created 12/6/24
 */
public class Rocket {
    public String color;
    public int size;

    /**
    *  No params constructor for the Rocket object.
    */
    public Rocket() {
        this.color = "red";
        this.size = 100;
    };
    /**
     * Constructor for the Rocket object for the size parameter.
     * @param size - The size of the rocket
     */
    public Rocket(int size) {
        this();
        this.size = size;
    };
    /**
     * Constructor for the Rocket object for the color parameter.
     * @param color - The color of the rocket
     */
    public Rocket(String color) {
        this();
        this.color = color;
    }

    /** 
     *  Returns information about the Rocket
     *  @return a string containing info about the rocket.
     */
    @Override
    public String toString() {
        return "My rocket is a size " + size
               + " and " + color + ".";
    }
}

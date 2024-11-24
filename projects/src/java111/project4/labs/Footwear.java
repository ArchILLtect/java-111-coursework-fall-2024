/**
 * Footwear superclass
 * @author Nick Hanson Sr.
 */

public class Footwear {
    // instance variables/attributes
    private String make;
    private String model;
    private int size;
    private String color;

    /** Sets the footwear's make
     * @param newMake footwear's make
     */
    public void setMake(String newMake) {
        make = newMake;
    }

    /** Gets the footwear's make
     * @return footwear's make
     */
    public String getMake() {
        return this.make;
    }

    /** Sets the footwear's model
     * @param model footwear's model
    */
    public void setModel(String newModel) {
        model = newModel;
    }

    /** Gets the footwear's model
     * @return footwear's model
     */
    public String getModel() {
        return this.model;
    }

    /** sets the footwear's color
     * @param color footwear's color
     */
    public void setColor(String newColor) {
        color = newColor;
    }

    /** Gets the footwear's color
     * @return footwear's color
     */
    public String getColor() {
        return this.color;
    }

    /** sets the footwear's size
    * @param newSize footwear's size
    */
    public void setSize(int newSize) {
        size = newSize;
    }

    /** Gets the footwear's size
     * @return footwear's size
     */
    public int getSize() {
        return this.size;
    }

    /** Display information about the footwear and a message that
     *  tells the user the footwear has started
     */
     public void display() {
        System.out.println();
        System.out.print("The " + color + " " + make + " " + model + " shoes are size " + size + ".");
    }
}

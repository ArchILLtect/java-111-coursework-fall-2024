/**
 * Boot class represents a boot in the Footwear System
 * @author Nick Hanson Sr.
 */

public class Boot extends Footwear {

    private int height;
    private boolean spurs;

    /** Returns value of height
     * @return height of boot
     */
    public int getHeight() {
        return height;
    }

    /** Sets new value of height
     * @param newHeight boot's height
     */
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    /** Returns value of spurs
     * @return boolean - whether or not the boot has spurs
     */
    public boolean getSpurs() {
        return spurs;
    }

    /** Sets new value of spurs
     * @param newSpurs boolean - whether or not the boot has spurs
     */
    public void setSpurs(boolean newSpurs) {
        this.spurs = newSpurs;
    }

    /** Display information about the car and a message that
     *  tells the user the car has started
     */
    @Override
    public void display() {
        super.display();
        System.out.print(" It is " + height + "\" high and ");
        if (spurs) {
            System.out.print("does");
        } else {
            System.out.print("does not");
        }
        System.out.print(" have spurs.");
    }
}

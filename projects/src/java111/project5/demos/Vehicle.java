package java111.project5.demos;
/** Represents a vehicle. This will be used
 *  for demo throughout the semester.
 *
 *  @author pwaite
 */

 public abstract class Vehicle implements Maintainable {
    // instance variables/attributes
    private String make;
    private String model;
    private int year;
    private String color;
    static int numberOfVehicles;

    public Vehicle() {
        numberOfVehicles++;
        System.out.println("In the vehicle no arg/default constructor.");
    };

    /** creates a vehicle with number of cylinders
     * @param make vehicle's make
     * @param model vehicle's model
     * @param year vehicle's year
     * @param color vehicle's color
     */
    public Vehicle(String make, String model, int year, String color) {
        this();
        System.out.println("In the vehicle constructor, setting all values.");
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    };

    /** Sets the vehicle's make
     * @param newMake vehicle's make
     */
     public void setMake(String newMake) {
        make = newMake;
    }

    /** Gets the vehicle's make
     * @return vehicle's make
     */
    public String getMake() {
        return this.make;
    }

    /** Sets the vehicle's model
     * @param model vehicle's model
    */
    public void setModel(String newModel) {
        model = newModel;
    }

    /** Gets the vehicle's model
     * @return vehicle's model
     */
    public String getModel() {
        return this.model;
    }

    /** sets the vehicle's color
     * @param color vehicle's color
     */
    public void setColor(String newColor) {
        color = newColor;
    }

    /** Gets the vehicle's color
     * @return vehicle's color
     */
    public String getColor() {
        return this.color;
    }

    /** sets the vehicle's year
    * @param year vehicle's year
    */
    public void setYear(int newYear) {
        year = newYear;
    }

    /** Gets the vehicle's year
     * @return vehicle's year
     */
    public int getYear() {
        return this.year;
    }

    /** Return information about the vehicle and a message that
     *  tells the user the vehicle has started
     *  @return a string containing vehicle info.
     */
    @Override
     public String toString() {
        return "The " + color + " " + year + " " + make + " " + model +
                " is starting.";
    }
}
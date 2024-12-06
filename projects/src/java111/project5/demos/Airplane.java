package java111.project5.demos;
/**
 * Airplane class represents an airplane in the Vehicle System
 * @author Nick Hanson Sr.
 */

public class Airplane extends Vehicle {

    private int numberOfEngines;

    public Airplane() {
        System.out.println("In the airplane constructor.");
    };

    /** creates a airplane
     * @param numberOfEngines airplane's number of cylinders
    */
    public Airplane(int numberOfEngines) {
        this();
        System.out.println("In the airplane constructor, setting the cylinders.");
        this.numberOfEngines = numberOfEngines;
    };

    /** creates a airplane with number of cylinders
     * @param make airplane's make
     * @param model airplane's model
     * @param year airplane's year
     * @param color airplane's color
     * @param numberOfEngines airplane's number of cylinders
     */
    public Airplane(String make, String model, int year, String color, int numberOfEngines) {
        super(make, model, year, color);
        System.out.println("In the airplane constructor, setting all values.");
    };

    /** Returns value of numberOfEngines
     * @return number of engines
     */
    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    /** Sets new value of numberOfEngines
     * @param newNumberOfEngines airplane's number of engines
     */
    public void setNumberOfEngines(int newNumberOfEngines) {
        this.numberOfEngines = newNumberOfEngines;
    }

    /** Display information about the vehicle and a message that
     *  tells the user the vehicle has started
     */
    @Override
    public String toString() {
        return "The " + getColor() + " " + getYear() + " " + getMake() + " " + getModel() +
              " is starting. It has " + numberOfEngines + " engines.";
    }

    /** Determines the cost of maintainance
     * @return maintenance cost
     */
    @Override  
    public double determineMaintenanceCost() {
        return 500.0 * numberOfEngines;
    }

}

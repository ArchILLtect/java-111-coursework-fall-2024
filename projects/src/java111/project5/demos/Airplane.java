package java111.project5.demos;
/**
 * Airplane class represents an airplane in the Vehicle System
 * @author Nick Hanson Sr.
 */

public class Airplane extends Vehicle {

    private int numberOfEngines;

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

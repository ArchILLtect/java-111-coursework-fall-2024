/**
 * Car class represents a car in the Vehicle System
 * @author Nick Hanson Sr.
 */

public class Car extends Vehicle {

    private int numberOfCylinders;

    /** Returns value of numberOfCylinders
     * @return number of cylinders
     */
    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    /** Sets new value of numberOfCylinders
     * @param newNumberOfCylinders car's number of cylinders
     */
    public void setNumberOfCylinders(int newNumberOfCylinders) {
        this.numberOfCylinders = newNumberOfCylinders;
    }

    /** Display information about the car and a message that
     *  tells the user the car has started
     * @return a string containing vehicle info.
     */
    @Override
    public String toString() {
        return super.toString() +
                " It has " + numberOfCylinders + " cylinders.";
    }

    /** Determines the cost of maintainance
     * @return maintenance cost
     */
    @Override  
    public double determineMaintenanceCost() {
        return 250.0 * numberOfCylinders;
    }

}

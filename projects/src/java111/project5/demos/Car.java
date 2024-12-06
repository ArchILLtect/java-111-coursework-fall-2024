package java111.project5.demos;
/**
 * Car class represents a car in the Vehicle System
 * @author Nick Hanson Sr.
 */

public class Car extends Vehicle {

    private int numberOfCylinders;


    /** creates a car */

    public Car() {
        System.out.println("In the car constructor.");
    };

    /** creates a car
     * @param numberOfCylinders car's number of cylinders
    */
    public Car(int numberOfCylinders) {
        this();
        this.numberOfCylinders = numberOfCylinders;
        System.out.println("In the car constructor, setting the cylinders.");
    };

    /** creates a car with number of cylinders
     * @param make car's make
     * @param model car's model
     * @param year car's year
     * @param color car's color
     * @param numberOfCylinders car's number of cylinders
     */
    public Car(String make, String model, int year, String color, int numberOfCylinders) {
        super(make, model, year, color);
        this.numberOfCylinders = numberOfCylinders;
        System.out.println("In the car constructor, setting all values.");
    };

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

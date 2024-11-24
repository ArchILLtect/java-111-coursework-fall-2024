/**
 *  Represents a vehicle.
 *
 *@author    pwaite
 */


public class Vehicle {
    // Instance variables/attributes
    String make;
    String model;
    int year;
    String color;

    /** Display information about the vehivle abd a nessage that
     * tells the user the vehicle has started.
     */
    public void start() {
        System.out.println("The " + color + " " + year + " " + make + " " +
            model + " is starting!");
    }
}

/**
 *  Test drives the vehicle.
 *
 *@author    pwaite
 */
public class VehicleTestDrive {
    /** Instantiate 2 vehicle objects and
     * call the start method on each one.
     * 
     * @param args command line arguments (not used here)
     */

    public static void main(String[] args) {

        // Instantiate a vehicle object, and assigning it to the vehicle
        Vehicle vehicle1 = new Vehicle();
        // Instantiate a vehicle object, and assigning it to the vehicle
        Vehicle vehicle2 = new Vehicle();

        // Set some details on the first vehicle object
        vehicle1.make = "Chevy";
        vehicle1.model = "Blazer";
        vehicle1.year = 2003;
        vehicle1.color = "grey";

        // Set some details on the second vehicle object
        vehicle2.make = "Toyota";
        vehicle2.model = "4-Runner";
        vehicle2.year = 2012;
        vehicle2.color = "black";

        // Call the start method on vehicle1 and vehicle2
        vehicle1.start();
        vehicle2.start();
    }

}

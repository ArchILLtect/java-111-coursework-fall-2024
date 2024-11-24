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

        // Instantiate an array of 2 vehicle object references
        Vehicle[] vehicles = new Vehicle[2];

        // Instantiate 2 vehicles, one for each index
        vehicles[0] = new Vehicle();
        vehicles[1] = new Vehicle();

        // Set some details on the first vehicle object
        vehicles[0].make = "Chevy";
        vehicles[0].model = "Blazer";
        vehicles[0].year = 2003;
        vehicles[0].color = "grey";

        // Set some details on the second vehicle object
        vehicles[1].make = "Toyota";
        vehicles[1].model = "4-Runner";
        vehicles[1].year = 2012;
        vehicles[1].color = "black";

        /** Call the start method on vehicle1 and vehicle2
        vehicles[0].start();
        vehicles[1].start(); **/

        // Call the start method on all vehicles with a for loop
        for (int count = 0;count < vehicles.length; count++) {
            vehicles[count].start();
        }
    }

}

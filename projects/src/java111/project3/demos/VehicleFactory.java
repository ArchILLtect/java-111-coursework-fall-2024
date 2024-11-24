import java.util.*;

/**
 *  Represents the factory that holds a vehicle.
 *
 *  @author    Nick Hanson
 */

public class VehicleFactory {
    // create an instance variable that will hold an array of vehicle
    // references but do not instantiate the array yet.
    // Vehicle[] listOFVehicles;

    ArrayList<Vehicle> listOFVehicles;

    /** creates vehicles and puts them in a listOfVehicles */
    public void createVehicles() {
        System.out.println("in the create Vehicles");
        // instantiates an array that will hold Vehicled obj refs.
        //listOfVehicles = new Vehicle[3];
        listOFVehicles = new ArrayList<Vehicle>();

        // create a vehicle and assign to the first slot in nthe array
        //listOFVehicles.add(new Vehicle());

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setMake("Chevy");
        vehicle1.setModel("Blazer");
        vehicle1.setYear(2003);
        vehicle1.setColor("grey");
        listOFVehicles.add(vehicle1);

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setMake("Toyota");
        vehicle2.setModel("4 Runner");
        vehicle2.setYear(2012);
        vehicle2.setColor("black");
        listOFVehicles.add(vehicle2);

        // use set methods to assign values...
        // set some details on the first vehicle object


        System.out.println("at the end of the create Vehicles()");

    }
    /** start each vehicle in the list */
    public void startAllVehicles() {
        // Loop through all the vehicles and call the start on each one
        System.out.println("in startAllVehicles");

        for (int counter = 0; counter < listOFVehicles.size(); counter++) {
            Vehicle vehicleList = listOFVehicles.get(counter);
            vehicleList.start();
            //listOFVehicles.get(counter).start();
        };
        System.out.println();
        System.out.println("Enhanced for loop output follows:");
        for (Vehicle vehicleList1 : listOFVehicles) {
            vehicleList1.start();
        }

    }
    /** method to call all the other methods */
    public void run() {
        createVehicles();
        startAllVehicles();
    }
}
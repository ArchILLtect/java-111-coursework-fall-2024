/**
 * Demonstrates creating instances of subclasses of the Vehicle
 * @author Nick Hanson Sr.
 */

public class VehicleSuperSub {
    /**
     * Create an Airplane and a Car, and call
     * the start method on each one.
     */
    public static void main(String[] args) {
        // Instantiate a Car
        Car car = new Car();

        car.setMake("Chevy");
        car.setModel("Blazer");
        car.setYear(2003);
        car.setColor("red");
        car.setNumberOfCylinders(8);

        // Instantiate an Airplane
        Airplane plane = new Airplane();
        plane.setMake("Cirrus");
        plane.setModel("SR22");
        plane.setYear(2018);
        plane.setColor("White with red stripe");
        plane.setNumberOfEngines(2);

        //car.start();
        //plane.start();

        // toString() demo:
        //System.out.println(plane.toString());
        //System.out.println(car.toString());
        // If called without ".toString()" it is still implicitly called:
        // I.e. the following does the same as previous above.
        System.out.println(plane);// Implicitly calls toString();
        System.out.println(car);// Implicitly calls toString();
    }
}

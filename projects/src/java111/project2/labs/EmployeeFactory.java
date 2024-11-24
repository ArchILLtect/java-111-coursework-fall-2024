/**
 * Lab 5: Arrays of Objects Part 1
 *  
 * @author Nick Hanson
 * Created on: 10/05/24
 * 
*/
public class EmployeeFactory {

    private Employee[] employees;

    /**
     *  This method instantiates an array of Employees
    */
    public void setup() {

        // Instantiates a new array of Employee Objects, holding 3 instances.
        employees = new Employee[3];

        // Instantiates 3 employess
        employees[0] = new Employee();
        employees[1] = new Employee();
        employees[2] = new Employee();

        // Use the set methods to assign data
        employees[0].setFirstName("Jaylin");
        employees[0].setLastName("Bello");
        employees[0].setEmpID(567);
        employees[0].setSalary(87000.00);

        employees[1].setFirstName("Imani");
        employees[1].setLastName("Diallo");
        employees[1].setEmpID(9);
        employees[1].setSalary(58390.00);

        employees[2].setFirstName("Aoi");
        employees[2].setLastName("Tanaka");
        employees[2].setEmpID(1690);
        employees[2].setSalary(93000.00);

    }
    /**
     *  This method iterates through an array and displays each object using a while loop
    */
    public void runWhile() {

        System.out.println("Displaying employees using a while loop:"); // Add a blank line to separate loop runs
        System.out.println(); // Add a blank line to separate title from loop run

        // While loop that iterates through the array of Employee objects
        int counter = 0;
        while (counter < employees.length) {
            // Each iteration calls the method to display the current object and then increment counter
            employees[counter].displayAll();
            counter++;
        }
        System.out.println(); // Add a blank line to separate loop runs
    }
    /**
     *  This method iterates through an array and displays each object using a for loop
    */
    public void runFor() {

        System.out.println("Displaying employees using a for loop:"); // Add a blank line to separate loop runs
        System.out.println(); // Add a blank line to separate title from loop run

        // For loop that iterates through the array of Employee objects
        for (int count = 0; count < employees.length; count++) {
            // Each iteration calls the method to display the current object
            employees[count].displayAll();
        }
    }
}

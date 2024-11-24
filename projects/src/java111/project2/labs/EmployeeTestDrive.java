/**
 * Lab 3: Arguments - Test Drive
 *  
 * @author Nick Hanson
 * Created on: 10/05/24
 * 
 */
public class EmployeeTestDrive {

    /**
     *  The main method for the Employee class
     *  Create Employee objects and display their info
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
        
        // Instantiates a Object Reference Array to hold 3 employees
        Employee[] employees = new Employee[3];

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
        
        // Calls on the methods to display Employee info
        int counter = 0;
        while (counter < employees.length) {
            employees[counter].displayAll();
            counter++;
        }


    }

}

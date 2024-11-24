/**
 * Lab 4: Getters and Setters
 *  
 * @author Nick Hanson
 * Created on: 10/05/24
 * 
*/
public class Employee {
    
    private String firstName;
    private String lastName;
    private int empID;
    private double salary;

    /**
     *  Getter method to access the first name
    */
    public String getFirstName() {
        return this.firstName;
    }
    /**
     *  Setter method to modify the first name
    */
    public void setFirstName(String name) {
        this.firstName = name;
    }

    /**
     *  Getter method to access the last name
    */
    public String getLastName() {
        return this.lastName;
    }
    /**
     *  Setter method to modify the last name
    */
    public void setLastName(String name) {
        this.lastName = name;
    }

    /**
     *  Getter method to access the employee ID
    */
    public int getEmpID() {
        return this.empID;
    }
    /**
     *  Setter method to modify the employee ID
    */
    public void setEmpID(int ID) {
        this.empID = ID;
    }

    /**
     *  Getter method to access the employee ID
    */
    public double getSalary() {
        return this.salary;
    }
    /**
     *  Setter method to modify the employee ID
    */
    public void setSalary(double value) {
        this.salary = value;
    }

    /**
     *  This method is used to display all instance values
    */
    void displayAll() {
        System.out.println(getFirstName() + " " + getLastName() + " has employee id number " + getEmpID() +
                ", and earns " + String.format("$%,.2f", this.getSalary()) + " per year.");
    }

}

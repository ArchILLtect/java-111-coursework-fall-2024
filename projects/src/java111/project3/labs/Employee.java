

public class Employee {
    
    private String firstName;
    private String lastName;
    private int employeeID;

    /**
	 * Returns the value of firstName.
	 * @return vehicle firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the value of firstName.
	 * @param newFirstName The value to assign firstName.
	 */
	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}

        /**
	 * Returns the value of lastName.
	 * @return vehicle lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the value of lastName.
	 * @param newLastName The value to assign lastName.
	 */
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}

    /**
	 * Returns the value of employeeID.
	 * @return vehicle employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * Sets the value of employeeID.
	 * @param newEmployeeID The value to assign employeeID.
	 */
	public void setEmployeeID(int newEmployeeID) {
		this.employeeID = newEmployeeID;
	}

    /** Display information about the employee.
	 *  @return String - employee information
     */
    public String displayMessage() {
       return ("Employee " + firstName + " " + lastName + " has an ID of " + employeeID);
    }


}

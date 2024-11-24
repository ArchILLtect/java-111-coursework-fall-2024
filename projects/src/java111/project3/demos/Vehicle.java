/**
 *  Represents a vehicle.
 *
 *  @author    Nick Hanson
 */


public class Vehicle {
    // Instance variables/attributes
    String make;
    String model;
    int year;
    String color;

    /** Display information about the vehivle abd a message that
     * tells the user the vehicle has started.
     */
    public void start() {
        System.out.println("The " + color + " " + year + " " + make + " " +
            model + " is starting!");
    }

    /**
	 * Returns the value of make.
	 * @return vehicle make
	 */
	public String getMake() {
		return make;
	}


	/**
	 * Sets the value of make.
	 * @param make The value to assign make.
	 */
	public void setMake(String make) {
		this.make = make;
	}

        /**
	 * Returns the value of model.
	 * @return vehicle model
	 */
	public String getModel() {
		return model;
	}


	/**
	 * Sets the value of model.
	 * @param model The value to assign model.
	 */
	public void setModel(String model) {
		this.model = model;
	}


	/**
	 * Returns the value of year.
	 * @return the vehicle's year
	 */
	public int getYear() {
		return year;
	}


	/**
	 * Sets the value of year.
	 * @param year The value to assign year.
	 */
	public void setYear(int year) {
		this.year = year;
	}

    /**
	 * Returns the value of color.
	 * @return the vehicle's color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * Sets the value of color.
	 * @param year The value to assign color.
	 */
	public void setColor(String color) {
		this.color = color;
	}
}

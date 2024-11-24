/**
 * Lab 5: Array of Objects Part 2
 *  
 * @author Nick Hanson
 * Created on: 10/05/24
 * 
*/
public class LabFiveVariables {

    private int count = 1;


    /**
     *  Getter method to access the count
    */
    public int getCount() {
        return this.count;
    }
    /**
     *  Setter method to modify the count
    */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     *  This method is used to display all instance values
    */
    void run() {
        int count = 15;
        // Print the local count var
        System.out.println("The local variable named count is: " + count);
        // Print the instance count var - 2 different ways
        System.out.println("The instance variable named count is: " + this.count + " (printed from the run() method)");
        System.out.println("The instance variable named count is: " + getCount() + " (printed another way from the run() method)");
    }

}

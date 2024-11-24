/**
* 
* Project 1 - Part 3
* 
* The name loop class
*  
* @author Nick Hanson
* Created on: 09/09/24
* 
*/
public class NameLoop {

    // Initialize instance variable for the name
    String fullName;
    // Initialize instance variable for the loop counter
    int loopCounter = 7;

    /**
     *  This method is used to display a name repeatedly on it's own line
     */
    void repeatName() {
        // Loops until loopCounter is reached
        while (loopCounter > 0) {
            // Print the defined name
            System.out.println(fullName);
            // Increment the loop counter
            loopCounter--;
        }
    }
}

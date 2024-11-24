/**
* Lab 1.2 - Booleans and 'if' statements
* 
* The LabOneSelection class
*  
* @author Nick Hanson
* Created on: 08/30/24
*/


public class LabOneSelection {
    /**
     * Main method for this class which will compare 
     * a variable to the number 100 and output message
     * indicating whether or not the variable is bigger than 100.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        //Your code goes in here
        int myNum = 100;
        // Check var myNum
        if (myNum > 100) {
            // If var myNum is larger then 100 print larger
            System.out.println("It's bigger than 100");
        } else {
            // If var myNum is smaller than 100 print smaller
            System.out.println("It's not bigger than 100");
        }

    }
}

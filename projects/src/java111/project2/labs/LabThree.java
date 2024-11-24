/**
 * Lab 3: Arguments
 *  
 * @author Nick Hanson
 * Created on: 10/05/24
 * 
*/
public class LabThree {
    /**
     *  This method is the code for the sayHello action.
    */
    void sayHello(String person) {
        System.out.println("Hello there " + person);
    }

    /**
     *  This method is the code for the sayHelloAgain action.
    */
    int count = 0;
    void sayHelloAgain(String person, int counter) {
        while (counter > count) {
            System.out.println("Hello there " + person);
            count++;
        }
        
    }
}

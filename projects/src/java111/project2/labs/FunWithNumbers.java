/**
 * Lab 6: Fun With Numbers
 *  
 * @author Nick Hanson
 * Created on: 10/05/24
 * 
*/
public class FunWithNumbers {

    /**
     *  This method makes calcs and dsiplays them
    */
    void run() {
        int firstInt = 5;
        int secondInt = 10;
        int thirdInt = 3;
        int fourthInt = 25;

        int intResults = 0;
        double doubleResults = 0.0;

        intResults = firstInt + secondInt + thirdInt + fourthInt;
        System.out.println("5 + 10 + 3 + 25 = " + intResults);

        doubleResults = (firstInt * secondInt * fourthInt) / (double) thirdInt;
        System.out.println("5 * 10 * 25 / 3 = " + doubleResults);
    }

}

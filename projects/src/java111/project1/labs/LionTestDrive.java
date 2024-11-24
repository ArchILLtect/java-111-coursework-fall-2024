/**
 * Lab 4: Getting into Objects - Part 4
 *  
 * @author Nick Hanson
 * Created on: 09/05/24
 * 
 */
public class LionTestDrive {

    /**
     *  The main method for the LionTestDrive class
     *  which will create two Lion objects and 
     *  call the roar method for each.
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
        
        // Instantiates 2 new lions
        Lion mufasa = new Lion();
        Lion simba = new Lion();
        
        // Calls to make the lions roar.
        mufasa.roarLoud();
        simba.roarLow();

        /** I hope I don't lose points for deviating somewhat from the directions.
        *  I could have just called for roars using the same roar() method that I
        *  commented out in the class definition (Lion.java) like so:
        *
        *  mufasa.roar();
        *  simba.roar(); */
        
    }

}

/**
 *  This class contains the logic for the word list app for Lab 9
 *
 *  @author Nick Hanson
 *  - Created on: October 20, 2024
*/

public class WordListLauncher {
    /** The main method creates a Lab36UserInput object
     *  and calls the run() method.
     *
     *  @param args command line arguments
    */
    public static void main(String[] args) {
        WordListUserInterface userInterface = new WordListUserInterface();
        userInterface.run();
    }
}

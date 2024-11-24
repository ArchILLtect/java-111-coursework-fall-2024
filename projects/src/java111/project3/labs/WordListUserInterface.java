/**
 *  This class contains the logic for the word list app for Lab 9
 *
 *  @author Nick Hanson
 *  - Created on: October 20, 2024
*/

public class WordListUserInterface {

    String prompt = "Please enter a word, or enter 'n' to quit:";
    String userInput = "";

    // Instantiate an InputHelper object to get user inputs
    InputHelper helper = new InputHelper();
    // Instantiate a WordListLogic object to handle the word list changes
    WordListLogic logic = new WordListLogic();

    /**
     *  This method prompts the used to enter words until they quit
     * 
    */
    public void promptForWords() {
        // Use a loop to 
        while(true) {
            userInput = helper.getUserInput(prompt);
            if (userInput.equals("n")) {
                displayUniqueWords();
                break;
            };
            logic.addWord(userInput);
        }
    };

    /**
     *  This method displays all unique words entered by user after quitting
     * 
    */
    public void displayUniqueWords() {
        System.out.println("******** Your list of unique words: ********");
        System.out.println();

        for (String word : logic.uniqueWords) {
            System.out.println(word);
        };
    };

    /**
     *  This method kicks off the application
     * 
    */
    public void run() {
        promptForWords();
    }
}

/**
 *  This class contains the user interface for the guessing game for Lab 6
 *
 *  @author Nick Hanson
 *  - Created on: October 20, 2024
*/

public class UserInterface {
    
    String userInputString = "";
    int userGuess = 0;
    String prompt = "Enter any number 1 to 100: ";
    GameLogic game = new GameLogic();
    InputHelper helper = new InputHelper();

    /**
     *  This method prompts the user for a number (or guess)
    */
    public void getGuess() {
        // Use a loop to catch bad input (non numbers)
        while(true) {
            try {
                userInputString = helper.getUserInput(prompt);
                userGuess = Integer.parseInt(userInputString);
                break;
            } catch(NumberFormatException e) {
                displayMessage("Invalid input. Please enter a valid number...");
            }
        }
    }

    /**
     *  This method displays the given String to the CLI
     *  @param message - string to be displayed
    */
    public void displayMessage(String message) {
        System.out.println(message);
    }

    /**
     *  This method kicks off a new game
    */
    public void playGame() {
        game.generateRandomNumber();
        int totalAttempts = 0;
        getGuess();

        while (true) {
            totalAttempts++;
            if (game.isCorrectGuess(userGuess)) {
                displayMessage(game.checkGuess(userGuess));
                displayMessage("Total attempts: " + totalAttempts);
                break;
            }
            displayMessage(game.checkGuess(userGuess));
            getGuess();
        }
    }
}

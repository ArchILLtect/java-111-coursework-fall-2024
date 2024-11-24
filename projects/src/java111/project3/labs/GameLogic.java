/**
 *  This class contains the logic for the guessing game for Lab 6
 *
 *  @author Nick Hanson
 *  - Created on: October 20, 2024
*/

public class GameLogic {

    private int targetNumber;
    private int MIN = 1;
    private int MAX = 100;

    /**
     *  This method generates a random number
    */
    public void generateRandomNumber() {
        targetNumber = (int)(Math.random() * MAX) + MIN;
    }

    /**
     *  This method checks the input number against target number
    */
    public String checkGuess(int guess) {
        if (guess < targetNumber) {
            return "Too low";
        } else if (guess > targetNumber) {
            return "Too high";
        } else {
            return "YOU GOT IT!!!";
        }
    }

    /**
     *  This method checks if the target number and user input match
     *  While this method is not comnpletely necessary, it does make
     *  the logic for the playGame loop easier.
     * 
     *  @return true if matches, false if not
    */
    public boolean isCorrectGuess(int guess) {
        if (guess == targetNumber) {
            return true;
        } else {
            return false;
        }
    }
}

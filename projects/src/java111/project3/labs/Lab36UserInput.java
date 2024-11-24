/** Lab 3-6
 * Learning to use the input helper
 * @author Nick Hanson
 */

public class Lab36UserInput {
    // Instantiate a new input helper object
    InputHelper helper = new InputHelper();

    /** This method runs a loop that prompts the user for a word until the user enters "quit"
     * @param 
     */
    public void run() {

        String userInput = "";
        String prompt = "Please enter a word, or \"quit\" to exit:";

        // Run a loop displaying user Input until "quit" is entered. FINAL CHOICE
        while(true) {
            userInput = helper.getUserInput(prompt);
            if (userInput.equals("quit")) {
                System.out.println("Goodbye!");
                break; // Exit the loop
            }

            System.out.println("You entered: " + userInput);
            System.out.println();
        }


        /*  FIRST ATTEMPTS:
        int loop = 1;
        String prompt = "Please enter a word, or \"quit\" to exit:";

        while(loop == 1) {
            String userInput = helper.getUserInput(prompt);
            if (userInput.equals("quit")) {
                System.out.println("Goodbye!");
                loop = 0;
            } else {
                System.out.println("You entered: " + userInput);
                System.out.println();
            }

        } 

        String userInput = "";
        String prompt = "Please enter a word, or \"quit\" to exit:";

        while(!userInput.equals("quit")) {
            userInput = helper.getUserInput(prompt);
            if (userInput.equals("quit")) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("You entered: " + userInput);
                System.out.println();
            }

        }*/
    }
    
}

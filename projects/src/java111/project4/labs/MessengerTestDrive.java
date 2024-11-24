/**
 * This class is used to launch the Messenger class
 * @author Nick Hanson Sr.
 *  - Created on: November 12, 2024
 */



public class MessengerTestDrive {
    /**
     *  The main program for the Messenger class
     *
     * @param  args  The command line arguments
     */

    public static void main(String[] args) {
        // Instantiate a Messenger and SpanishMessenger class
        Messenger messenger = new Messenger();
        SpanishMessenger spanishMessenger = new SpanishMessenger();

        messenger.display();
        spanishMessenger.display();
    }

}

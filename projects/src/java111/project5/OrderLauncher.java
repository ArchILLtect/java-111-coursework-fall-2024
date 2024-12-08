package java111.project5;

/**
 * The {@code OrderLauncher} class is the entry point for the
 * order processing app.
 * <p>This class is part of Project 5 - Part 2</p>
 * @author Nick Hanson
 * @version 1.0
 * @since 12/7/24
 */
public class OrderLauncher {

    /**
     * The main method is the entry point for the application.
     * It creates an {@code OrderManager} object and invokes its {@code run()} method
     * to manage and display orders.
     *
     * @param args command-line arguments (not used in this application)
     */
    public static void main(String[] args) {

        // Create and instantiate a new OrderManager
        OrderManager orderManager = new OrderManager();

        // Call the run() method on the new object
        orderManager.run();
    }
}

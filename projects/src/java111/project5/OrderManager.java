package java111.project5;

import java.util.ArrayList;

/**
 * The {@code OrderManager} class manages an order collection.
 * <p>This class is part of Project 5 - Part 2</p>
 * @author Nick Hanson
 * @version 1.0
 * @since 12/7/24
 */
public class OrderManager {

    // Create a list to store orders
    ArrayList<OrderProcess> orderList;

    // Smaple orders
    OrderProcess order1;
    ShippedOrder order2;
    ShippedOrder order3;

    /**
     * Creates sample orders and adds them to the order list.
     */
    public void createOrders() {
        orderList = new ArrayList<>();
        // Create objects and:
        // Set info for OrderProcess - yes it **can** be used
        order1 = new OrderProcess("Muhammad", 1234, "Widget", 7, 12.99);
        // Set info for ShippedOrder
        order2 = new ShippedOrder("Hui Yin", 23454, "Widget", 7, 12.99, true);
        // Set info for another ShippedOrder which *can* be used for both shipping and non-shipping orders!
        order3 = new ShippedOrder("Jose Tela", 45, "Widget", 15, 9.99, false);
        // Add each order to the list
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
    }

    /**
     * Displays all orders in the order list.
     * This method loops through the {@code ArrayList} and displays
     * each orders toString
     */
    public void displayOrders() {
        for (OrderProcess order : orderList) {
            System.out.println();
            System.err.print(order.toString());
            System.out.println();
        };
    }

    /**
     * This method calls the other processing mehods
     */
    public void run() {
        this.createOrders();
        this.displayOrders();
    }
}

package java111.project5;

/**
 * The {@code OrderProcess} class represents an order without
 * shipping.
 * <p>This class is part of Project 5 - Part 2</p>
 * 
 * @author Nick Hanson
 * @version 1.0
 * @since 12/7/24
 */
public class OrderProcess {

    // Customer's name
    private String custName;
    // Customer's ID number
    private int custNumber;
    // Name of product ordered
    private String productName;
    // Quantity of product ordered
    private int quantityOrdered;
    // Price of product ordered
    private double unitPrice;

    /**
     * Default constructor.
     */
    public OrderProcess() {};

    /**
     * Constructs an {@code OrderProcess} object.
     *
     * @param name the name of the customer
     * @param id the customer ID
     * @param item the name of the product
     * @param quantity the quantity of the product ordered
     * @param price the unit price of the product
     */
    public OrderProcess(String name, int id, String item, int quantity, double price) {
        this.custName = name;
        this.custNumber = id;
        this.productName = item;
        this.quantityOrdered = quantity;
        this.unitPrice = price;
    };

    /**
     * Calculates the total price for the order.
     *
     * @param quantity the quantity ordered
     * @param unitPrice the unit price of the product
     * @return the total price of the order
     */
    public double calculatePrice(int quantity, double unitPrice) {
        return (double) quantityOrdered * unitPrice;
    }

    /**
     * Returns a string based on the the order, with customer details,
     * product details, and the total price.
     *
     * @return a string with order details
     */
    @Override
    public String toString() {
        return  "Customer: " + custName +
                "\nCustomer ID: " + custNumber +
                "\nItem Ordered: " + productName +
                "\nUnit Price: $" + String.format("%.2f", unitPrice) +
                "\nQuantity Ordered: " + quantityOrdered +
                "\nTotal: $" + this.calculatePrice(quantityOrdered, unitPrice)
        ;
    }
}

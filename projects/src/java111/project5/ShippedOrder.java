package java111.project5;

/**
 * The {@code ShippedOrder} class represents an order with
 * optional shipping. 
 * <p>This class is part of Project 5 - Part 2</p>
 * 
 * <p>Shipping charge calculation:</p>
 * <ul>
 *   <li>1-3 items: $1.50</li>
 *   <li>4-6 items: $3.00</li>
 *   <li>7-9 items: $6.00</li>
 *   <li>10+ items: $7.00</li>
 * </ul>
 * @author Nick Hanson
 * @version 1.0
 * @since 12/7/24
 */
public class ShippedOrder extends OrderProcess {

    // Indicates whether order is to be shipped or not
    private boolean ship;
    // Shipping charge for the order
    private double shippingCharge = 0;
    // Total price not including shipping
    private double totalPrice;
    // Final price with shipping
    private double netPrice;

    /**
     * Default constructor.
     */
    public ShippedOrder() {};

    /**
     * Constructs a {@code ShippedOrder} without shipping charges.
     *
     * @param custName the name of the customer
     * @param id the customer ID
     * @param itemName the name of the product
     * @param quantity the quantity ordered
     * @param price the unit price of the product
     */
    public ShippedOrder(String custName, int id, String itemName, int quantity, double price) {
        super(custName, id, itemName, quantity, price);
    }

    /**
     * Constructs a {@code ShippedOrder} with optional shipping charges.
     *
     * @param custName the name of the customer
     * @param id the customer ID
     * @param itemName the name of the product
     * @param quantity the quantity ordered
     * @param price the unit price of the product
     * @param ship indicates whether shipping charges apply
     */
    public ShippedOrder(String custName, int id, String itemName, int quantity, double price, boolean ship) {
        super(custName, id, itemName, quantity, price);
        this.ship = ship;
        // Calculate shipping if needed
        if (ship == true) {
            if (quantity >= 1 && quantity <= 3) {
                shippingCharge = 1.50;
            } else if (quantity >= 4 && quantity <= 6) {
                shippingCharge = 3.00;
            } else if (quantity >= 7 && quantity <= 9) {
                shippingCharge = 6.00;
            } else if (quantity >= 10) {
                shippingCharge = 7.00;
            }
        }
    };

    /**
     * Calculates the total price for the order, including shipping charges if applicable.
     *
     * @param quantity the quantity ordered
     * @param unitPrice the unit price of the product
     * @return the total price of the order
     */
    @Override
    public double calculatePrice(int quantity, double unitPrice) {
        totalPrice = super.calculatePrice(quantity, unitPrice);
        netPrice = totalPrice + shippingCharge;
        return totalPrice;
    }

    /**
     * Returns a string based on the order. Includes shipping details if added.
     *
     * @return a string with order and shipping information (if applicable)
     */
    @Override
    public String toString() {
        if (ship) {
            // Include shipping details
            String superToString = super.toString();
            String shippingPrice =
                    "\nShipping Charge: $" + String.format("%.2f", shippingCharge) +
                    "\nGrand Total: $" + String.format("%.2f", netPrice);
            return superToString + shippingPrice;
        } else {
            // Use the super class's method for no shipping orders
            return super.toString();
        }
    }

}

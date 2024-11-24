/** This class represents an Item.
 * This class is part 1 of Project 2 Part 2
 *  
 *  @author Nick Hanson
 *  - Created on: October 5, 2024
*/
public class Item {

    private int itemID;
    private int itemQuantity;
    private double itemPrice;
    private String itemDesc;

    // The following methods are public getters and setters for each instance variable
    /** Getter method to access the item ID of the item
     * @return ID of item
    */
    public int getItemID() {
        return this.itemID;
    }
    /** Setter method to modify the item ID of the item
     * @param newItem item ID
    */
    public void setItemID(int newItem) {
        this.itemID = newItem;
    }

    /** Getter method to access the quantity of the item
     * @return item's quantity
    */
    public int getItemQuantity() {
        return this.itemQuantity;
    }
    /** Setter method to modify the quantity of the item
     * @param newQuantity quantity for this item
    */
    public void setItemQuantity(int newQuantity) {
        this.itemQuantity = newQuantity;
    }

    /** Getter method to access the price of the item
     * @return item's price
    */
    public double getItemPrice() {
        return this.itemPrice;
    }
    /** Setter method to modify the price of the item
     * @param newPrice price of the item
    */
    public void setItemPrice(double newPrice) {
        this.itemPrice = newPrice;
    }

    /** Getter method to access the description of the item
     * @return item's description
    */
    public String getItemDesc() {
        return this.itemDesc;
    }
    /** Setter method to modify the description of the item
     * @param newItemDesc description of the item
    */
    public void setItemDesc(String newItemDesc) {
        this.itemDesc = newItemDesc;
    }

    /** Calculates and returns the total price for the item
     *  @returns total price of all the item's quantity
     */
    public double calculateItemTotal() {
        return (double) itemQuantity * itemPrice;
    }

    /** This method returns a String containing the item information,
     * including the item total cost
     * @returns item information including item total cost
    */
    public String display() {
        String studentInfo = "Item ID: " + itemID + ", Quantity: " + itemQuantity +
                ", Price: $" + String.format("%.2f", itemPrice) + ", Description: " + itemDesc +
                ", Total Cost: $" + String.format("%.2f", calculateItemTotal());
        return studentInfo;
    }
 
}

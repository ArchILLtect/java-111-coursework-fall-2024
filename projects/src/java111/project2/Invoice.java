/** This class represents Invoices.
 * This class is part 2 of Project 2 Part 2
 *  
 *  @author Nick Hanson
 *  - Created on: October 5, 2024
*/
public class Invoice {
    
    private Item[] items;

    double invoiceTotal;

    /** Getter method to access the invoice total
     * @return Invoice total
    */
    public double getInvoiceTotal() {
        return this.invoiceTotal;
    }

    /** Setter method to modify the item ID of the item
     * @param newItem item ID
    */
    public void setItems(Item[] newItems) {
        items = newItems;
    }

    /** Loop through each item and add the item total to
     * the invoice total for each
    */
    public void calculateInvoice() {
        for (int counter = 0; counter < items.length; counter++) {
            invoiceTotal = invoiceTotal + items[counter].calculateItemTotal();
        }
    }

    /** This method loops through each item and runs
     * the display method for each
    */
    public void displayInvoice() {
        for (int counter = 0; counter < items.length; counter++) {
            System.out.println(items[counter].display());
            System.out.println();
        }
        System.out.println("Invoice Total: $" + invoiceTotal);
    }
}

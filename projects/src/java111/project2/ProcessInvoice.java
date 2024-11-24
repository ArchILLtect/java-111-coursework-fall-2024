/** This class processes Invoices.
 * This class is part 3 of Project 2 Part 2
 *  
 *  @author Nick Hanson
 *  - Created on: October 5, 2024
*/
public class ProcessInvoice {
    
    //This instance variable holds an invoice
    private Invoice invoice;

    // Create items and pass them to the invoice
    private void createItems() {

        // Instantiate three objects of type Item into a local array.
        Item[] items = new Item[3];

        // Set each object’s instance variables with the object’s set methods.
        items[0] = new Item();
        items[1] = new Item();
        items[2] = new Item();

        items[0].setItemID(123);
        items[0].setItemQuantity(2);
        items[0].setItemPrice(9.99);
        items[0].setItemDesc("widgets");

        items[1].setItemID(4444);
        items[1].setItemQuantity(1);
        items[1].setItemPrice(15.46);
        items[1].setItemDesc("doodads");

        items[2].setItemID(99);
        items[2].setItemQuantity(20);
        items[2].setItemPrice(2.00);
        items[2].setItemDesc("thingies");

        // Set the array of Item objects into the Invoice with the set method.
        invoice.setItems(items);
    }

    /** This method instantiates a new Invoice object and assigns it to the
     * instance variable, calls the createItems method, and then calls the
     * calculateInvoice and displayInvoice methods on the Invoice object
    */
    public void runProcess() {
        invoice = new Invoice();

        createItems();

        invoice.calculateInvoice();

        invoice.displayInvoice();
    }
}

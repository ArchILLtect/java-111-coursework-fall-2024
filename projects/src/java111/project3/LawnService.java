import java.text.NumberFormat;
import java.util.*;

/**
 *  This is the LawnService class which holds Client 
 *  objects and calculates the service needs
 *  
 *
 * @author    Nick Hanson
 */
public class LawnService {

    private  InputHelper        input;
    private  ArrayList<Client>  clients;

    /**
     *  This method gets the clients
     */
    public void clientDataEntry() {

        clients = new ArrayList<Client>();
        input = new InputHelper();

        String  name                = "";
        String  lawnLengthString    = "";
        String  lawnWidthString     = "";
        String  paymentsString      = "";
        String  more                = "";
        int     lawnLength          = 0;
        int     lawnWidth           = 0;
        int     numberOfPayments    = 0;
        Client  newClient           = null;

        while (true) {
            name = input.getUserInput(
                    "Enter the name of the client: ");
            lawnLengthString = input.getUserInput(
                    "Enter the length of the lawn in yards: ");
            lawnWidthString = input.getUserInput(
                    "Enter the width of the lawn in yards: ");
            paymentsString = input.getUserInput(
                        "Number of payments (1, 2 or 22): ");
            lawnLength = Integer.parseInt(lawnLengthString);
            lawnWidth = Integer.parseInt(lawnWidthString);
            numberOfPayments = Integer.parseInt(paymentsString);
            newClient = new Client();
            newClient.setName(name);
            newClient.setLawnLength(lawnLength);
            newClient.setLawnWidth(lawnWidth);
            newClient.setNumberOfPayments(numberOfPayments);
            clients.add(newClient);
            more = input.getUserInput(
                    "Would you like to add another client?");
            if (!more.equals("y")) {
                break;
            }
        }
    }

    /**
     *  This method calculates the total area for all clients
     * 
     *  @return total area to mow for all clients
     */
    public int getTotalArea() {
        int totalArea = 0;

        for (Client allClients : clients) {
            totalArea += allClients.calculateLawnSize();
        }

        return totalArea;
    }

    /**
     *  This method calculates the total revenue from all clients
     * 
     *  @return total revenue from season from all clients
     */
    public int getTotalRevenue() {
        int totalRevenue = 0;

        for (Client allClients : clients) {
            totalRevenue += allClients.calculateTotalCharge();
        }

        return totalRevenue;
    }

    /**
     *  This method displays the service totals
     */
    public void displayTotals() {
        
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        System.out.println("Total number of clients: " + clients.size());
        System.out.println("Total square yards to mow: " + getTotalArea());
        System.out.println("Total revenue for the summer: " + currencyFormat.format(getTotalRevenue()));

    }

    /**
     *  This method display the clients to the CLI.
     */
    public void displayClients() {

        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();

        Client  client  = null;
        for (int i = 0; i < clients.size(); i++) {
            client = clients.get(i);
            System.out.println(client.display());
            System.out.println();
        }

        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();
    }

    /**
     *  This methods initializes the app
     */
    public void run() {
        clientDataEntry();
        displayClients();
        displayTotals();
    }
}



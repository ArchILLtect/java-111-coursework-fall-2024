import java.text.NumberFormat;

/**
 *   This class holds information about a client
 *
 *   @author Nick Hanson
 */
public class Client {

    private  String  name;
    private  int     lawnLength;
    private  int     lawnWidth;
    private  int     numberOfPayments;

    private  final int  SEASON_LENGTH = 22;

    /**
     *  Sets the name attribute of the Client
     *
     * @param  name - The new name value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *  Gets the name attribute of the Client
     *
     * @return    The name value
     */
    public String getName() {
        return name;
    }

    /**
     *  Sets the lawnLength attribute of Client
     *
     * @param  newLawnLength - The new lawn length value
     */
    public void setLawnLength(int newLawnLength) {
        this.lawnLength = newLawnLength;
    }

    /**
     *  Gets the lawnLength attribute of Client
     *
     * @return    The lawnLength value
     */
    public int getLawnLength() {
        return lawnLength;
    }

    /**
     *  Sets the lawnWidth attribute of Client
     *
     * @param  newLawnWidth - The new lawn width value
     */
    public void setLawnWidth(int newLawnWidth) {
        this.lawnWidth = newLawnWidth;
    }

    /**
     *  Gets the lawnWidth attribute of Client
     *
     * @return    The lawnWidth value
     */
    public int getLawnWidth() {
        return lawnWidth;
    }

    /**
     *  Sets the numberOfPayments attribute of Client
     *
     * @param  newNumberOfPayments - The new lawn width value
     */
    public void setNumberOfPayments(int newNumberOfPayments) {
        this.numberOfPayments = newNumberOfPayments;
    }

    /**
     *  Gets the numberOfPayments attribute of Client
     *
     * @return The numberOfPayments value
     */
    public int getNumberOfPayments() {
        return numberOfPayments;
    }

    /**
     *  This method calculates the total area of the lawn
     *
     *  @return Int - Area of the lawn (sq. yds.)
     */
    public int calculateLawnSize() {
        return getLawnLength() * getLawnWidth();
    }

    /**
     *  Calculate the total season charge
     * 
     *  @return Int - amount of season charges
     */
    public int calculateSeasonCharge() {

        final int SMALL_LAWN_RATE     = 25;
        final int MEDIUM_LAWN_RATE    = 35;
        final int LARGE_LAWN_RATE     = 50;

        int seasonCharge;

        if (calculateLawnSize() < 500) {
            seasonCharge = SMALL_LAWN_RATE * SEASON_LENGTH;
        } else if (calculateLawnSize() < 800) {
            seasonCharge = MEDIUM_LAWN_RATE * SEASON_LENGTH;
        } else {
            seasonCharge = LARGE_LAWN_RATE * SEASON_LENGTH;
        };

        return seasonCharge;
    }
    
    /**
     *  Calculate the total service charge
     * 
     *  @return Int - amount of service charges
     */
    public int calculateServiceCharge() {

        final int ONE_PAYMENT           = 1;
        final int TWO_PAYMENTS          = 2;
        final int FULL_PAYMENT_CHARGE   = 3;
        final int TWO_PAYMENT_CHARGE    = 5;

        int serviceCharge = 0;

        if (numberOfPayments == ONE_PAYMENT) {
            // Leave service charge at 0 - Added this check for readability only
        } else if (numberOfPayments == TWO_PAYMENTS) {
            serviceCharge = numberOfPayments * TWO_PAYMENT_CHARGE;
        } else if (numberOfPayments == SEASON_LENGTH) {
            serviceCharge = numberOfPayments * FULL_PAYMENT_CHARGE;
        };

        return serviceCharge;
    }

    /**
     *  Calculate the total charge
     * 
     *  @return Int - total charges for season
     */
    public int calculateTotalCharge() {
        return calculateSeasonCharge() + calculateServiceCharge();
    }

    /**
     *  Calculate the payment amount
     * 
     *  @return Double - amount per payment
     */
    public double calculatePaymentAmount() {
        return calculateTotalCharge() / numberOfPayments;
    }


    /**
     *  This method returns the client information for displaying
     *
     *  @return String - The Client's information
     */
    public String display() {

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        return "Client: " + getName()
                + "\nLawn Size: " + calculateLawnSize() + " sq. yds."
                + "\nNumber of payments: " + getNumberOfPayments()
                + "\nAmount of each payment: " + currencyFormat.format(calculatePaymentAmount())
                + "\nTotal of all payments: " + currencyFormat.format(calculateTotalCharge());
    }
}


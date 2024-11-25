/**
 *   This sub class holds information about an AutoLoan (Assignment 2, Unit 4)
 *   @author Nick Hanson
 *     - Created 11/23/24
 */

public class AutoLoan extends BankAccount {

    // Delcare instance variables
    private double balance;

    /** This method calculates a debit to the bank account
     *  @return balance after debit
     */
    public double debitAccount(double debitAmount){
        double newBalance = this.getBalance() + debitAmount;
        this.setBalance(newBalance);
        return this.balance;
    };

    /** This method calculates a crebit to the bank account
     *  @return balance after crebit
     */
    public double creditAccount(double creditAmount){
        double newBalance = this.getBalance() - creditAmount;
        this.setBalance(newBalance);
        return this.balance;
    };

    /** Return class name and the balance of the AutoLoan.
     *  @return a string containing the classname and auto loan balance.
     */
    @Override
    public String toString() {
        return "AutoLoan{" +
               "balance='" + this.balance + '\'' +
               '}';
    }
}

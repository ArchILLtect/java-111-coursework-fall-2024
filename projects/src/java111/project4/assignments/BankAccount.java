/**
 *   This super class holds information about a BankAccount (Assignment 2, Unit 4)
 *   @author Nick Hanson
 *     - Created 11/23/24
 */

public abstract class BankAccount {

    // Delcare instance variables
    private double balance;

    /** Gets the balance attribute of the BankAccount
     *  @return    The balance value of the bank account
    */
    public double getBalance() {
        return balance;
    }

    /** Sets the balance attribute of the BankAccount
     *  @param  newBalance - The new balance value
     */
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    /** This method calculates a debit to the bank account
     *  @return balance after debit
     */    
    public abstract double debitAccount(double debitAmount);

    /** This method calculates a crebit to the bank account
     *  @return balance after crebit
     */
    public abstract double creditAccount(double creditAmount);

    /** Return class name and the balance of the BankAccount.
     *  @return a string containing the classname and bank account balance.
     */
    @Override
    public String toString() {
        return "BankAccount{" +
               "balance='" + this.balance + '\'' +
               '}';
    }
}

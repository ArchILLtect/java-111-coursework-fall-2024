import java.util.*;
/**
 * Instantiates and manipulates bank accounts (for Assignment 2 of Unit 4)
 * @author Nick Hanson Sr.
 *  - Created on: November 23, 2024
 */
public class BankAccountTestDrive {
    
    /** The main program for the FruitBasketTestDrive (Assigment 1) class. It instatiates a
     *  CitrusBasket object and runs the class's methods on it.
     *
     * @param  args  The command line arguments
     */
    public static void main(String[] args) {

        // Create an ArrayList for objects
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

        // Instantiate new auto loan and checking account objects
        AutoLoan autoLoan = new AutoLoan();
        CheckingAccount checkingAccount = new CheckingAccount();

        // Set the balance for the new account objects
        autoLoan.setBalance(10000.00);
        checkingAccount.setBalance(2000.00);

        // Add the accounts to the list array
        accounts.add(autoLoan);
        accounts.add(checkingAccount);

        // Iterate through the list array and print the balance of each
        for (BankAccount account : accounts) {
            System.out.println(account.toString() + " has a balance of $" +
                    String.format("%.2f", account.getBalance()));
        }

        System.out.println();
        System.out.println("Crediting accounts $500.00....");
        System.out.println();

        // Iterate through the list array, apply a credit and print the balance of each
        for (BankAccount account : accounts) {
            account.creditAccount(500.00);
            System.out.println(account.toString() + " has a balance of $" +
                    String.format("%.2f", account.getBalance()));
        }

        System.out.println();
        System.out.println("Debiting accounts $200.00....");
        System.out.println();

        // Iterate through the list array, apply a debit and print the balance of each
        for (BankAccount account : accounts) {
            account.debitAccount(200.00);
            System.out.println(account.toString() + " has a balance of $" +
                    String.format("%.2f", account.getBalance()));
        }


    }
}

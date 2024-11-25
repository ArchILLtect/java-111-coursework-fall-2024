import java.util.*;

public class BankAccountTestDrive {
    

    public static void main(String[] args) {

        // Create an ArrayList for objects
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

        AutoLoan autoLoan = new AutoLoan();
        CheckingAccount checkingAccount = new CheckingAccount();

        autoLoan.setBalance(10000.00);
        checkingAccount.setBalance(2000.00);

        accounts.add(autoLoan);
        accounts.add(checkingAccount);

        for (BankAccount account : accounts) {
            System.out.println(account.toString() + " has a balance of $" +
                    String.format("%.2f", account.getBalance()));
        }

        System.out.println();
        System.out.println("Crediting accounts $500.00....");
        System.out.println();

        for (BankAccount account : accounts) {
            account.creditAccount(500.00);
            System.out.println(account.toString() + " has a balance of $" +
                    String.format("%.2f", account.getBalance()));
        }

        System.out.println();
        System.out.println("Debiting accounts $200.00....");
        System.out.println();

        for (BankAccount account : accounts) {
            account.debitAccount(200.00);
            System.out.println(account.toString() + " has a balance of $" +
                    String.format("%.2f", account.getBalance()));
        }


    }
}



public abstract class BankAccount {
    
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public abstract double debitAccount(double debitAmount);

    public abstract double creditAccount(double creditAmount);
}

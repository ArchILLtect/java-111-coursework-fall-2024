public class CheckingAccount extends BankAccount {
    
    private double balance;

    public double debitAccount(double debitAmount){
        double newBalance = this.getBalance() - debitAmount;
        this.setBalance(newBalance);
        return this.balance;
    };

    public double creditAccount(double creditAmount){
        double newBalance = this.getBalance() + creditAmount;
        this.setBalance(newBalance);
        return this.balance;
    };

    @Override
    public String toString() {
        return "Checking Account";
    }

}

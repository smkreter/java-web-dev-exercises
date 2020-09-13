package exercises.bankstuff.tests;

public class BankAccount {
    protected double balance;
    private int accountNumber;

    public BankAccount (int accountNumber) {
        this.balance = 0;
        this.accountNumber = accountNumber;

    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public double getBalance() {
        return balance;
    }
}

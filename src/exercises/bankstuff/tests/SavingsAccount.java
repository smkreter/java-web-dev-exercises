package exercises.bankstuff.tests;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(int accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void compoundInterest() {
        this.balance = this.balance + (this.balance*this.interestRate);
    }

}

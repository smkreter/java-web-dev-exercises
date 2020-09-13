package exercises.bankstuff.tests;

public class CheckingAccount extends BankAccount {
    private double fee;
    public CheckingAccount(int accountNumber, double fee) {
        super(accountNumber);
        this.fee = fee;
    }
    public void chargeFee(fee) {
        this.balance -= fee;
    }
}

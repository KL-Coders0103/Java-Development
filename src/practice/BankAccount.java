package practice;

public class BankAccount {

	private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully");
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount");

        } else if (amount > balance) {
            System.out.println("Insufficient balance");

        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance = ₹" + balance);
    }

    public void displayAccountDetails() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : ₹" + balance);
    }
}

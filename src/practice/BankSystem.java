package practice;

import java.util.Scanner;

public class BankSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter account holder name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount account =
                new BankAccount(accountNumber, accountHolder, balance);

        int choice;

        do {

            System.out.println("\n----- BANK MENU -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    account.displayAccountDetails();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);
        
        sc.close();
	}

}

package exceptions;

public class ATM {

	public static void main(String[] args) {
		int balance = 5000;
		int amount = 7000;
		
		try {
			System.out.println("ATM Transactions");
			if(amount > balance) {
				System.out.println("Insufficient Balance");
			} else {
				balance = balance - amount;
				System.out.println("Collect your cash");
				System.out.println("Remaining balanace: "+balance);
			}
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("Collect your cash");
			System.out.println("ATM connection closed");
		}
		System.out.println("Transaction process");

	}

}

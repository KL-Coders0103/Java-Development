package synchronizedDemo;

public class BankAccount {
	private int balance = 3000;
	void withdraw(String name, int amount) {
		System.out.println(name+" is trying withdraw "+amount+" amount");
		
		synchronized (this) {
			if(balance >= amount) {
				System.out.println(name+" can withdraw money");
				balance = balance - amount;
				System.out.println(name+" withdraw successfully");
				System.out.println("Remaining balanace "+balance);
			} else {
				System.out.println("Insufficient balance");
			}
		}
	}
	
	void checkBalance() {
		System.out.println("Current Balance: "+balance);
	}
}

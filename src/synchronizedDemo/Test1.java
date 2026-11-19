package synchronizedDemo;

public class Test1 {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		Thread t1 = new Thread(() -> {
			account.withdraw("Lovesh", 2500);
		});
		Thread t2 = new Thread(() -> {
			account.withdraw("Bhavesh", 5500);
		});
		
		t1.start();
		t2.start();
	}

}

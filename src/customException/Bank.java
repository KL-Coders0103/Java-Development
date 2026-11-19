package customException;

public class Bank {
	
	static void withDram(int amt, int balance) throws InSufficientBalanceException{
		if(amt>balance) {
			throw new InSufficientBalanceException("Insufficient balance");
		}
		System.out.println("Withdrawl successful");
		
	}

}

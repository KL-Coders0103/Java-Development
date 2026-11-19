package customException;

public class Test {

	public static void main(String[] args) {
		try {
			Bank.withDram(3000, 2500);
		} catch (InSufficientBalanceException e) {
			e.printStackTrace();
		}

		System.out.println("Rst of code");
	}

}

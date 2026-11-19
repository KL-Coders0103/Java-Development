package exceptions;

public class Calculator {
	
	public static void main(String[] args) {
		try {
			int num = 30/0;
			System.out.println(num);
		} catch (ArithmeticException e) {
			System.out.println(e + " number divided by 0");
		}
		System.out.println("Addition:  ");
	}

}

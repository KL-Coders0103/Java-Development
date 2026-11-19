package exceptions;

public class Sample1 {
	
	static void check(int age) {
		if(age<18) {
			throw new ArithmeticException("not eligible to vote");
		} else {
			System.out.println("Eligible to vote");
		}
	}

	public static void main(String[] args) {
		try {
			Sample1.check(11);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Rest of the code");

	}

}

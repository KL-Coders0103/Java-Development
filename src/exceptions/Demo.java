package exceptions;

public class Demo {

	public static void main(String[] args) {
		try {
			int a =20, b=0;
			int res = a/b;
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("ATM connection closed");
		}
		
		System.out.println("Transaction closed");
	}

}

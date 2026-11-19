package exceptions;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int num = 30/0;
			System.out.println(num);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (StackOverflowError e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Additoon");

	}

}

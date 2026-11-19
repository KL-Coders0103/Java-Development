package interfaces;

public interface Payment {
	
	void pay(double amount);
	
	default void receipt() {
		System.out.println("Common payment receipt");
		System.out.println("Receipt generated successfully");
	}
	
	static void validateAmount(double amount) {
		if(amount<=0) {
			System.out.println("invalid Amount");
		} else {
			System.out.println("valid amount");
			}
         
    }

}

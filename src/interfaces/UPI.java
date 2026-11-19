package interfaces;

public class UPI implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("Payment "+amount+" done using UPI");
	}
	
	public void receipt() {
		 System.out.println("UPI payment Recept");
         System.out.println("Status : successfully");
  
	}
	
}

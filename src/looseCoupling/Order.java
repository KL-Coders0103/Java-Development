package looseCoupling;

public class Order {
	private Payment payment;
	
	Order(Payment payment){
		this.payment = payment;
	}
	
	void placeOrder(String item) {
		System.out.println("You order "+item);
		payment.pay();
	}
	

	public static void main(String[] args) {
		Order order1 = new Order(new UPI()); //loose coupling
		order1.placeOrder("Biryani");
		
		System.out.println("");
		
		Order order2 = new Order(new CreditCard()); //loose coupling
		order2.placeOrder("Shawarma");

	}

}

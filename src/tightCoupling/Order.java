package tightCoupling;

public class Order {
	
	UPI order1 = new UPI();
	CreditCard order2 = new CreditCard();
	
	void placedOrder() {
		order1.payByUPI();
		order2.payByCard();
	}

	public static void main(String[] args) {
		Order obj = new Order();
		obj.placedOrder();

	}

}

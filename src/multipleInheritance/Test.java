package multipleInheritance;

public class Test {

	public static void main(String[] args) {
		OnlineOrder order = new OnlineOrder();
		order.pay(1500);
		order.delivery("Pune");
		order.show();
		
		Payment.display();
		Delivery.display();
	}

}

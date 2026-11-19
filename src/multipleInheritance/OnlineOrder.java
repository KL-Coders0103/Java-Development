package multipleInheritance;

public class OnlineOrder implements Payment, Delivery{

	@Override
	public void delivery(String add) {
		System.out.println("Order delivered to this "+add);
		
	}

	@Override
	public void pay(double amt) {
		System.out.println("Amount for the order is "+amt);
		
	}
	
	public void show() {
		System.out.println("In override method of online order implemented by payment and deliver interfaces");
		Payment.super.show();
		Delivery.super.show();
	}

}

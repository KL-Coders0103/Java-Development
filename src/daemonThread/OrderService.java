package daemonThread;

public class OrderService {
	
	static int pendingOrder = 0;
	
	public static synchronized void placeOrder() {
		pendingOrder++;
		System.out.println("Your order has been placed");
	}
	
	public static synchronized int getPendingOrder() {
		return pendingOrder;
	}

}

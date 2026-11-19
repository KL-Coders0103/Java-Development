package thread;

public class Test2 {

	public static void main(String[] args) {
		Priority p1 = new Priority("Payment");
		Priority p2 = new Priority("Order");
		Priority p3 = new Priority("Notification");
		
		p1.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.MIN_PRIORITY);
		p3.setPriority(Thread.NORM_PRIORITY);
		p1.start();
		p2.start();
		p3.start();
	}

}

package synchronizedDemo;

public class Test {

	public static void main(String[] args) {
		TicketBooking t = new TicketBooking();
		
		Thread t1 = new Thread(() -> t.Booktickets("Lovesh"));
		Thread t2 = new Thread(() -> t.Booktickets("Bhavesh"));
		
		t1.start();
		t2.start();
	}

}

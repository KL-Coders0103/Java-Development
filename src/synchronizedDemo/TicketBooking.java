package synchronizedDemo;

public class TicketBooking {
	int tickets = 1;
	synchronized void Booktickets(String name) {
		if(tickets > 0) {
			System.out.println(name+ " is booking ticket");
			tickets--;
			System.out.println("Ticket get booked by "+name);
		} else {
			System.out.println("Sorry "+name+" , no more tickets are available");
		}
	}
}

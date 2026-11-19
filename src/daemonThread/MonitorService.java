package daemonThread;

public class MonitorService extends Thread{
	OrderService service;
	public MonitorService(OrderService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		int previousCount = 0;
		while(true) {
			int count = OrderService.getPendingOrder();
			if( count != previousCount) {
				System.out.println("Pending orders: "+count);
				previousCount = count;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}

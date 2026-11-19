package daemonThread;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		OrderService service = new OrderService();
		MonitorService monitor = new MonitorService(service);
		monitor.setDaemon(true);
		monitor.start();
		
//		for(int i=1; i<=3; i++) {
//			service.placeOrder();
//			Thread.sleep(1000);
//		}
		
		Thread t1 = new Thread(() -> {
			OrderService.placeOrder();
		});
		Thread t2 = new Thread(() -> {
			OrderService.placeOrder();
		});
		Thread t3 = new Thread(() -> {
			OrderService.placeOrder();
		});
		
		t1.start();
		t1.join();
		Thread.sleep(1000);
		
		t2.start();
		t2.join();
		Thread.sleep(1000);
		
		t3.start();
		t3.join();
		Thread.sleep(1000);
		
		System.out.println("Store has been shut down");
	}

}

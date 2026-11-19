package daemonThread;

public class Sample1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			while(true) {
				System.out.println("Daemon thread started");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e){
					e.printStackTrace();
				}
			}
		});
		t1.setDaemon(true);
		t1.start();
		System.out.println("Main thread completed...");
	}

}

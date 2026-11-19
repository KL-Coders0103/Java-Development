package thread;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		MyThread m1 = new MyThread();
		Thread t1 = new Thread(m1);
		t1.setName("Thread 1");
		t1.start();
		t1.join();
		
		Thread t2 = new Thread(m1);
		t2.setName("Thread 2");
		t2.start();
	}

}

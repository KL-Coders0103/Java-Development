package thread;

public class MyTask {
	
	synchronized void display(int num) {
		for(int i=1; i<=3; i++) {
			System.out.println(Thread.currentThread().getName()+ " "+(num*i));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

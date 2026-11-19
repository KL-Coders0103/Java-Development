package thread;

public class Priority extends Thread{
	public Priority(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<=3; i++) {
			System.out.println("--------------------------");
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getPriority());
			System.out.println(i);
			System.out.println();
		}
	}
}

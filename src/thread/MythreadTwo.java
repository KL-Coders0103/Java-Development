package thread;

public class MythreadTwo extends Thread{
	MyTask t1;
	
	public MythreadTwo(MyTask t1) {
		super();
		this.t1=t1;
	}
	
	@Override
	public void run() {
		t1.display(5);
	}
}
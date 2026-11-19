package thread;

public class MythreadOne extends Thread{
	MyTask t1;
	
	public MythreadOne(MyTask t1) {
		super();
		this.t1=t1;
	}
	
	@Override
	public void run() {
		t1.display(5);
	}
}

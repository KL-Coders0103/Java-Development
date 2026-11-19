package thread;

public class Test3 {

	public static void main(String[] args) {
		MyTask task = new MyTask();
		
		MythreadOne t1 = new MythreadOne(task);
		MythreadTwo t2 = new MythreadTwo(task);
		t1.start();
		t2.start();
	}

}

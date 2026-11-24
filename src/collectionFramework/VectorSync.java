package collectionFramework;

import java.util.Vector;

public class VectorSync {

	public static void main(String[] args) throws InterruptedException{
		Vector<String> pro = new Vector<String>();
		Thread t1 = new Thread(() -> {
			pro.add("House");
		});
		
		Thread t2 = new Thread(() -> {
			pro.add("Room");
		});
		
		t1.start();
		t2.start();
		t2.join();
		
		System.out.println(pro);
	}

}

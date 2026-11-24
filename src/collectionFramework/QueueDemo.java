package collectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> emp = new LinkedList<String>();
		emp.offer("A");
		emp.offer("B");
		emp.offer("C");
		
		System.out.println(emp);
		
		System.out.println(emp.poll());
		
		System.out.println(emp.peek());
	}

}

package collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(40);
		q.add(10);
		q.add(30);
		q.add(20);
		
		System.out.println(q);
		
		q.remove();
		
		System.out.println(q);
	}

}

package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<Integer>();
		dq.offer(22);
		dq.offer(33);
		
		System.out.println(dq);
		
		dq.offerFirst(234);
		dq.offerLast(456);
		
		System.out.println(dq);
		
		dq.addFirst(88);
		dq.addLast(666);
		
		System.out.println(dq);
		
		dq.pollFirst();
		dq.pollLast();
		
		System.out.println(dq);
		
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
	}

}

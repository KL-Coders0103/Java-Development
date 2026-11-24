package collectionFramework;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>();
		s1.push("ABCD");
		s1.push("PQRS");
		s1.push("LMNO");
		
		System.out.println(s1);
		
		System.out.println(s1.pop());
		
		System.out.println(s1.search("ABCD"));
	}

}

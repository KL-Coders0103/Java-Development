package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> s1 = new LinkedHashSet<Integer>();
		s1.add(22);
		s1.add(33);
		s1.add(44);
		s1.add(null);
		s1.add(1);
		s1.add(3);
		  
		s1.add(1);
		s1.add(3);
		   
		System.out.println(s1);
	}

}

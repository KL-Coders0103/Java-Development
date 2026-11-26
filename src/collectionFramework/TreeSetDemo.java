package collectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> s1= new TreeSet<Integer>();
		s1.add(22);
		s1.add(33);
		s1.add(44);
		  
		s1.add(1);
		s1.add(3);
		   
		s1.add(1);
		s1.add(3);
		   
		System.out.println(s1);
		   
		System.out.println(s1.first());
		System.out.println(s1.last());
		System.out.println(s1.lower(33));
		System.out.println(s1.higher(33));
		  
		System.out.println(s1.floor(35));
		System.out.println(s1.ceiling(15));
	}

}

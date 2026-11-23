package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Sample1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(22);
		list.add(44);
		list.add(1);
		list.add(15);
		System.out.println(list);
		
		//Iterator
		Iterator<Integer> i = list.iterator();
		while(i.hasNext()) System.out.println(i.next());
		
		//for each loop
		System.out.println("For Each ...");
		for(int i1 : list) System.out.println(i1);
		
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(333);
		list2.add(77);
		list2.addAll(list);
		System.out.println(list2);
		
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(1234);
		list3.add(56);
		list3.addAll(list2);
		System.out.println(list3);
	}

}

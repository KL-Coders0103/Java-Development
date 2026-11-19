package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RollNumber {

	public static void main(String[] args) {
		List<Integer> rollList = new ArrayList<Integer>();
		rollList.add(22);
		rollList.add(33);
		rollList.add(44);
		System.out.println(rollList);
		
		//Iterator 
		System.out.println("Using Iterator");
		Iterator<Integer> i = rollList.iterator();
		while(i.hasNext()) System.out.println(i.next());
		
		//For each loop
		System.out.println("Using foreach Loop");
		for(int num : rollList) System.out.println(num);
	}

}

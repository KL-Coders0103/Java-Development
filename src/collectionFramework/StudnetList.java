package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class StudnetList {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Lovesh", 1500));
		list.add(new Student(2, "Bhavesh", 2000));
		list.add(new Student(3, "Kishu", 1000));
//		System.out.println(list);
		
		Iterator<Student> i = list.iterator();
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println(s);
		}
	}

}

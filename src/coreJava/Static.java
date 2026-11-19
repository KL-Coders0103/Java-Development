package coreJava;

public class Static {
	static int id=1;
	
	public Static() {
		System.out.println(id);
		id++;
		System.out.println(id);
	}
	
	static void display() {
		System.out.println(id);
	}

	public static void main(String[] args) {
		Static s1 = new Static();
		Static s2 = new Static();
		Static.display();
	}

}


/*
 * normal  id id++ newObject
 *   1     1   2   1
 *   
 *  Static id id++ newObject
 *    1    1   2    2
 */
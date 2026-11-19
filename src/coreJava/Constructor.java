package coreJava;

public class Constructor {

	int id;
	String name;
	
	// default constructor
	public Constructor() {
		System.out.println("I am in my Default Constructor....");
		id=05;
		name="Kishu";
	}
	
	// parameterized constructor
//	public Constructor(int x, String y) {
//		System.out.println("I am in my Parameterized Constructor....");
//		id = x;
//		name = y;
//	}
	
	//copy constructor
	public Constructor(Constructor c2) {
		System.out.println("I am in my Copy Constructor....");
		id = c2.id;
		name = c2.name;
	}
	
	// This Keyword:- use to reference that variable is referring to the current object
	public Constructor(int id, String name) {
		System.out.println("I am in my This Constructor....");
		this.id = id;
		this.name = name;
	}
	
	void print() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		c1.print();
		Constructor c2 = new Constructor(45, "Laksh");
		c2.print();
		Constructor c3 = new Constructor(c2);
		c3.print();
	}

}

package inheritance;

public class Employee extends Person {
	
	String name = "Lovesh";
	int id;
	
	public Employee() {
		super(); // use to call the parent class constructor
		System.out.println("I am in my child class constructore");
		
	}
	
	public Employee(int id, String name) {
		super(name);
		this.id = id;
		System.out.println("Employee Class Constructor");
	}
	
	void display() {
		System.out.println("Person name: "+super.name); // parent class name
		System.out.println("Employee name: "+name); // this class name
	}
	
	void talk() {
		System.out.println("Employee can talk");
	}
	
	void show() {
		talk(); // this class talk method
		super.talk(); // parent talk method
	}

}

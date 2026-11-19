package abstraction;

public abstract class Bank {
	
	abstract void ROI();
	
	// called by chaild class default constructor as it contains super keyword
	public Bank() {
		System.out.println("I am in abtract class constructor");
	}
	
	void show() {
		System.out.println("I am inside non abstract method in abstract class");
	}
	
	final void display() {
		System.out.println("I am inside final method in abstract class");
	}
	
	static void dispStatic() {
		System.out.println("I am in static method in abstract class");
	}
}

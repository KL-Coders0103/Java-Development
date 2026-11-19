package multipleInheritance;

public interface Payment {
	
	void pay(double amt);
	
	default void show() {
		System.out.println("In default method of payment interface");
	}
	
	static void display() {
		System.out.println("In static method of payment interface");
	}

}

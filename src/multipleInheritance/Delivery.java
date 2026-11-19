package multipleInheritance;

public interface Delivery {
	
	void delivery(String add);
	
	default void show() {
		System.out.println("In default method of delivery interface");
	}
	
	static void display() {
		System.out.println("In static method of delivery interface");
	}

}

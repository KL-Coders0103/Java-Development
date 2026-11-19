package interfaces;

public interface Bank {
	
	// it is by default public static final. So have to initialize value
	public int id = 22;
	
	// abstract method by default
	void ROI();
	
	public static void show() {
		System.out.println("Static method can implment here but can't override");
	}
	
	public default void display() {
		System.out.println("Default non abstract method can implment here but can't override");
	}
	
	private void impl() {
		System.out.println("private non absrtact method can implment here but can't override");
	}

}

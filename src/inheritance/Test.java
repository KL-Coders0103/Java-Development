package inheritance;

public class Test {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.display();
		
		Employee e2 = new Employee(15, "Bhavesh");
		e2.display();
	}

}

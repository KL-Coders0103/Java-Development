package daemonThread;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 05;
		e1.name = "Bhavesh";
		
		Employee e2 = new Employee();
		e2.id = 11;
		e2.name = "Lovesh";
		
		Employee e3 = new Employee();
		
		System.out.println("Before null: "+e1 + "\n"+e2);
		e1=null;
		e3 = e2;
		System.gc();
		System.out.println("After null: "+e1 + "\n"+e2);
		System.out.println("Main method completed");
	}

}

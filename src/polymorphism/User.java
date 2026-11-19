package polymorphism;

public class User {
	
	String name = "Lovesh";
	final int num;
	final String LastName = "Bodhani";
	
	public User () {
		num = 05;
		System.out.println(name + " " +LastName+ " "+num);
	}
	
	final void detail() {
		System.out.println("In final method of parent class");
	}
			

}

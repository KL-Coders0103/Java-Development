package accessModifier;

public class Employee {
	
	public int id;
	private String name;
	float salary;
	protected String designation;
	
	void display() {
		System.out.println(id+ " "+name+" "+salary+" "+designation);
	}

}


// Type  within-class  within package  outside-package    outside-pakasge
//                                     (inside subclass)   
// public     Y              Y              Y                   Y
// private    Y              N              N                   N
// default    Y              Y              N                   N
// protected  Y              Y              Y                   N

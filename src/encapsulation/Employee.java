package encapsulation;

public class Employee {

	// private variable cannot be accessed outside the class
	private int id;
	private String name;
	private float salary;
	
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	// to access or modify it we need getter and setter 
	// getter for getting the value 
	// setter means setting the value 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}

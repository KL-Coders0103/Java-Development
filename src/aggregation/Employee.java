package aggregation;

public class Employee {
	
	int id;
	String name;
	float salary;
	DOJ doj;
	
	public Employee(int id, String name, float salary, DOJ doj) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
				
	}
	
	void display() {
		System.out.println(id+" "+name+" "+" "+salary);
		System.out.println(doj.date+ " "+doj.month+" "+doj.year);
	}

}

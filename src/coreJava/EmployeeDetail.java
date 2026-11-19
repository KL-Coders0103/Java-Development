package coreJava;

public class EmployeeDetail {
	
	int id=05;
	String dept="SDE";
	String name="ABC";
	int salary = 125000;
	
	//Default method without return type
	void empDetail() {
		System.out.println("Id: "+id+" "+"Name: "+name+" "+"Dept: "+dept+" "+"Salary: "+salary);
	}
	
	void insertEmpDetail() {
		id=15;
		dept="CLOUD";
		name="PQR";
		salary=250000;
	}
	
	public static void main(String[] args) {
		EmployeeDetail emp = new EmployeeDetail();
		System.out.println("Using method call");
		emp.empDetail();
		
		emp.id=10;
		emp.dept="DEVOPS";
		emp.name="XYZ";
		emp.salary=300000;
		System.out.println("\nUsing object calling data member");
		emp.empDetail();
		
		System.out.println("\nUsing method call for data member and display");
		emp.insertEmpDetail();
		emp.empDetail();
	}

}

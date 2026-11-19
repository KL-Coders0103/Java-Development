package coreJava;

public class StudentDetail {
	
	int rollNo = 3;
	String name = "ABC";
	
	// default method without return type
	void displayStudent() {
		System.out.println("Student Name is "+name+" and roll no is "+rollNo);
	}
	
	//default method with return type
	int getRollNo() {
		return rollNo + 2;
	}
	
	//parameterized method without return type
	void insertStudentDetail(int a, String b) {
		rollNo = a;
		name = b;
	}
	
	//parameterized method with return type
	String getName(String n1) {
		name = n1;
		return name;
	}

	public static void main(String[] args) {
		StudentDetail std = new StudentDetail();
		std.displayStudent();
		System.out.println("Student Roll number is: "+std.getRollNo());
		std.insertStudentDetail(6, "PQR");
		std.displayStudent();
		std.getName("XYZ");
		std.displayStudent();

	}

}

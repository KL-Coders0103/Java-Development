package accessModifer1;

import accessModifier.Employee;

public class Company extends Employee {
	
	void display1() {
		id=234;
//		name="Kishu"; private is not accessible outside the package
//		salary=22.4f; default is not accessible outside the package
		designation = "Tester";
	}

}

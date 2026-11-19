package accessModifer1;

import accessModifier.Employee;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 222;
//		e1.name="ABCD"; private is not accessible outside the package
//      e1.salary=22.3f; default is not accessible outside the package		
//      e1.designation="CEO"; protected is not accessible outside the package
	}

}

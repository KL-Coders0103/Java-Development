package accessModifier;

public class Test {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.id = 222;
//      e1.name="Laksh"; private is not accessible outside the class
        e1.salary=3.4f;
        e1.designation="developer";
	}

}

package encapsulation;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(05, "Laksh", 1234.5f);
		e1.display();
		
		e1.setId(10);
		e1.setName("Kishu");
		e1.setSalary(123.05f);
		
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary());

	}

}

package inheritance;

public class Person {
	
	String name = "Laksh";
	
	public Person() {
		System.out.println("I am in my parent class");
	}
	
	public Person(String name) {
		System.out.println("Person class Constructore");
		this.name = name;
	}
	
	void talk() {
		System.out.println("Person can talk");
	}

}

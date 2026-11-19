package daemonThread;

public class Employee {
	int id = 777;
	String name = "kwjdwk";
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object destroyed");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}

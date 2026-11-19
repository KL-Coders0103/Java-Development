package aggregation_association_composition;

public class Test {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Lovesh");
		Department d1 = new Department("Developer", t1);
		System.out.println(d1);
	}
}

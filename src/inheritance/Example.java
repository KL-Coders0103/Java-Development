package inheritance;

public class Example {

	public static void main(String[] args) {
		
		Square s1 = new Square();
		s1.name="Square";
		s1.show();
		s1.areaSquare(2);
		
		Circle c1 = new Circle();
		c1.name="Circle";
		c1.show();
		c1.areaCircle(4);
	}

}

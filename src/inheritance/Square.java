package inheritance;

public class Square extends Shape {
	
	void areaSquare(int side) {
		this.side = side;
		System.out.println("Area: "+(side*side));
	}
}

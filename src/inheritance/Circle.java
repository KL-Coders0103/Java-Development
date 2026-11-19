package inheritance;

public class Circle extends Shape {
	float pi=3.24f;
	void areaCircle(int radius) {
		this.radius=radius;
		System.out.println("Area: "+(pi*radius*radius));
	}
}

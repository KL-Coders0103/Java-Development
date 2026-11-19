package coreJava;

public class CarFactory {
	
	String name, color;
	int hp;
	int price;

	public static void main(String[] args) {
		CarFactory car1 = new CarFactory();
		car1.name = "BMW";
		car1.color = "Gray";
		car1.hp = 220;
		car1.price = 10000000;
		
		System.out.println(car1.name + " "+ car1.color+ " "+ car1.hp+ " "+car1.price);
		
		CarFactory car2 = new CarFactory();
		car2.name = "Lambo";
		car2.color = "Neon";
		car2.hp = 320;
		car2.price = 35000000;
		
		System.out.println(car2.name + " "+ car2.color+ " "+ car2.hp+ " "+car2.price);
	}

}

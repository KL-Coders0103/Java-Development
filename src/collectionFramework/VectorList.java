package collectionFramework;

import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		Vector<String> product = new Vector<String>();
		
		product.add("Keyboard");
		product.add("Laptop");
		product.add("Phone");
		
		System.out.println(product);
		
		product.add(3,"ADCS");
		product.set(1, "One");
		System.out.println(product);
		System.out.println(product.firstElement());
		System.out.println(product.lastElement());
	}

}

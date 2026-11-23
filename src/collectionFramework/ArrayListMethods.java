package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> products = new ArrayList<String>();
		
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("CPU");
		
		System.out.println(products);
		products.add("Headphones");
		products.add("Mobile");
		
		System.out.println(products.get(2));
		
		//update
		products.set(2, "Speaker");
		
		//search
		System.out.println("Search: "+products.contains("Keyboard"));
		
		//find indes
		System.out.println("Index: "+products.indexOf("Mobile"));
		
		//count 
		System.out.println("count: "+products.size());
		
		//sort
		Collections.sort(products);
		System.out.println(products);
		
		// Is Empty
		System.out.println("Empty: "+products.isEmpty());
		
		
		
	}

}

package serializableDemo;

import java.io.*;
import java.util.*;


public class AnimalFacts {
	public static void main(String[] args) throws IOException{
		var in = new FileInputStream("C:\\\\Users\\\\loves\\\\eclipse-workspace\\\\coreJava\\\\src\\\\serializableDemo\\\\emp1.txt");
		var x = 22;
		var y = 2.3f;
		
		System.out.println(((Object)x).getClass().getName());
//		int x = in.read();
//		System.out.println(x+ " "+(char)x);
//		int i;
//		while((i=in.read())!=-1) {
//			System.out.println(i+":"+(char)i);
//			System.out.println((char)i);
//		}
		
		var sc = new Scanner(in);
		System.out.println("Animals fact: ");
		System.out.println(sc.nextLine());
		System.out.println(sc.next());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
	}
}

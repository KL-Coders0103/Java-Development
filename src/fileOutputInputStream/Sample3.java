package fileOutputInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Sample3 {

	public static void main(String[] args) {
		InputStream i;
		try {
			i = new FileInputStream("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\fileOutputInputStream\\emp.txt");
			int data;
			while((data = i.read())!=-1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("jhbdsfwdk");

	}

}

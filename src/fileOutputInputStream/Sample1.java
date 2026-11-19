package fileOutputInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Sample1 {

	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\fileOutputInputStream\\emp.txt");
		out.write(66);
		String s1 = "welcome to my class";
		byte []arr = s1.getBytes();
		out.write(arr);
		System.out.println("File successfully created");
	}

}

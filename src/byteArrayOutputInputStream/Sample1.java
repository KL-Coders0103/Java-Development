package byteArrayOutputInputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample1 {

	public static void main(String[] args) throws IOException{
		FileOutputStream out = new FileOutputStream("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\byteArrayOutputInputStream\\emp1.txt");
		FileOutputStream out1 = new FileOutputStream("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\byteArrayOutputInputStream\\emp2.txt");
		
		ByteArrayOutputStream b1 = new ByteArrayOutputStream();
		b1.write(66);
		String s1 = "Welcome to my class";
		byte []arr = s1.getBytes();
		b1.write(arr);
		b1.writeTo(out1);
		b1.writeTo(out);
		out.close();
		
		System.out.println("File successfully created");
	}

}

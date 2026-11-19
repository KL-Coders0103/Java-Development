package bufferOutputInputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Sample1 {

	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\bufferOutputInputStream\\emp.txt");
		BufferedOutputStream b1 = new BufferedOutputStream(out);
		
		b1.write(66);
		String s1 = "Welcome to my class";
		byte []arr = s1.getBytes();
		b1.write(arr);
		b1.flush();
		b1.close();
		out.close();
		
		System.out.println("File created successfully");
	}

}

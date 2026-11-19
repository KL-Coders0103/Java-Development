package fileOutputInputStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Sample4 {

	public static void main(String[] args) throws IOException, FileNotFoundException{
		OutputStream out = new FileOutputStream("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\fileOutputInputStream\\file.txt");
		DataOutputStream d1 = new DataOutputStream(out);
		
		d1.writeInt(66);
		d1.writeChar('A');
		d1.writeUTF("something");
		d1.writeFloat(67.78f);
		
		System.out.println("File created successfully");

	}

}

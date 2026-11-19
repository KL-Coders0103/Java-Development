package fileOutputInputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Sample5 {

	public static void main(String[] args) {
		InputStream i;
		try {
			i = new FileInputStream("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\fileOutputInputStream\\file.txt");
			DataInputStream d1 = new DataInputStream(i);
			int data = d1.readInt();
			System.out.println(data);
			char x1 = d1.readChar();
			System.out.println(x1);
			
			System.out.println(d1.readUTF());
			System.out.println(d1.readFloat());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("dbakk");
	}

}

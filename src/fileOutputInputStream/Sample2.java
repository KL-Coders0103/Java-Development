package fileOutputInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Sample2 {

	public static void main(String[] args) throws IOException{
		InputStream in = new FileInputStream("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\fileOutputInputStream\\emp.txt");
		int i;
		while((i=in.read())!=-1) {
			System.out.print((char)i);
		}

	}

}

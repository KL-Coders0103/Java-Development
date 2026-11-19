package bufferOutputInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Sample2 {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\bufferOutputInputStream\\emp.txt");
		BufferedInputStream br = new BufferedInputStream(in);
		
		int i;
		while((i=br.read())!=-1) {
			System.out.print((char)i);
		}

	}

}

package byteArrayOutputInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class Sample3 {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\byteArrayOutputInputStream\\emp1.txt");
		InputStream in1 = new FileInputStream("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\byteArrayOutputInputStream\\emp2.txt");
		
		SequenceInputStream s1 = new SequenceInputStream(in, in1);
		
		int i;
		while((i = s1.read())!=-1) {
			System.out.print((char) i);
		}
	}

}

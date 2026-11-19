package bufferReaderWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Sample2 {

	public static void main(String[] args) throws IOException {
		Reader r1 = new FileReader("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\bufferReaderWriter\\emp.txt");
		BufferedReader br = new BufferedReader(r1);
		int i;
		
		while((i = br.read()) != -1) {
			System.out.print((char) i);
		}
	}

}

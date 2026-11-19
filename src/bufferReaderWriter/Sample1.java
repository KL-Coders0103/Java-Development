package bufferReaderWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Sample1 {

	public static void main(String[] args) throws IOException {
		Writer w1 = new FileWriter("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\bufferReaderWriter\\emp.txt");
		BufferedWriter b = new BufferedWriter(w1);
		
		b.write("Welcome to my class");
		b.flush();
		b.close();
		w1.close();
		
		System.out.println("done");
				
	}

}

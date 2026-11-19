package printWritter;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample1 {

	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(System.out);
		out.write("Learn Java");
		out.println("Something");
		out.flush();
		out.close();
		
		PrintWriter out1 = new PrintWriter(new File("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\printWritter\\emp.txt"));
		
		out1.write("Learn Python");
		out1.flush();
		out1.close();
	}

}

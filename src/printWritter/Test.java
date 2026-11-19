package printWritter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\printWritter\\demo.txt");
		CustomFilterWriter w1 = new CustomFilterWriter(fw);
		w1.write("learn java filter input out file method");
		w1.close();
		
		FileReader fr = new FileReader("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\printWritter\\demo.txt");
		BufferedReader br = new BufferedReader(fr);
		int ch;
		while((ch = br.read()) != -1) {
			System.out.print((char) ch);
		}
	}

}

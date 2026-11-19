package bufferReaderWriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		
		System.out.println("Enter Employee name: ");
		String name = br.readLine();
		
		System.out.println("Enter Employee ID: ");
		String id1 = br.readLine();
		int id = Integer.parseInt(id1);
		
		System.out.println("Enter Employee Salary: ");
		float salary = Float.parseFloat(br.readLine());
		
		Employee e = new Employee(id, name, salary);
		System.out.println(e);
	}

}

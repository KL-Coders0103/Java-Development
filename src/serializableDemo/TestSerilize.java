package serializableDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerilize {

	public static void main(String[] args) throws IOException{
		Employee e1 = new Employee();
		e1.setId(10);
		e1.setName("Lovesh");
		e1.setSalary(300.5f);
		
		FileOutputStream f1 = new FileOutputStream("C:\\Users\\loves\\eclipse-workspace\\coreJava\\src\\serializableDemo\\emp.txt");
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		o1.writeObject(e1);
		System.out.println("Serialize successfully");
		o1.close();
		f1.close();
	}

}

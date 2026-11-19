package serializableDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserilize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream f1 = new FileInputStream("C:\\\\Users\\\\loves\\\\eclipse-workspace\\\\coreJava\\\\src\\\\serializableDemo\\\\emp.txt");
		ObjectInputStream o1 = new ObjectInputStream(f1);
		Employee e = (Employee)o1.readObject();
		System.out.println(e);
	}

}

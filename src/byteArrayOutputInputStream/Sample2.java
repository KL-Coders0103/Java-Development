package byteArrayOutputInputStream;

import java.io.ByteArrayInputStream;

public class Sample2 {

	public static void main(String[] args) {
		byte []data = {65, 66, 67};
		ByteArrayInputStream i = new ByteArrayInputStream(data);
		
		int j;
		while((j=i.read()) != -1) {
			System.out.println((char) j);
		}
	}

}

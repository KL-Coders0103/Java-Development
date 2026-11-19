package exceptions;

public class Sample {
	public static void main(String[] args) {
		try {
			int[] arr= {3,2,5};
	        System.out.println(arr[5]);
	    } catch (ArrayIndexOutOfBoundsException e) {
	    	System.out.println(e);
	        
	    }
	    
		System.out.println("rest of code...");
	}

}

package stringDemo;

public class MutableClass {
	public static void main(String[] args) {
	
		// Method 1:- StringBuffer
		StringBuffer s1= new StringBuffer("meena");
	    System.out.println(s1);
	        
	    //append works like concatination
	    s1.append(" Roy");
	    System.out.println(s1);
	        
	    s1.insert(0, "whatever");
	    System.out.println(s1);
	        
	    s1.replace(2, 4, "nothing");
	    System.out.println(s1);
	        
	    s1.reverse();
	    System.out.println(s1);
	      
	    
	    // Method 2:- StringBuilder    
	    StringBuilder ss= new StringBuilder("mmpoojamm");
	    ss.delete(2,6 );
	    System.out.println(ss);
	        
	 }

}

/*
 * StringBuffer represents a mutuable sequence of character that ensure thread safety
 * Making it suitable for involving multiple threads that modify character sequence
 * It includes various string manipulation, capabilities, including ability to insert, delete and append character
 * it avoids the necessity of generating new object with each change 
 * 
 * 
 * StringBuilder is same sa stringBuffer but it does not thread safety
 */
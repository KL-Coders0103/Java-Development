package stringDemo;

public class StringMethod {

	public static void main(String[] args) {
		String s1 = "Welcome";
		
		System.out.println("CharAt: "+ s1.charAt(2)); //charAt
		System.out.println("Length: "+ s1.length()); //length
		System.out.println("IndexOf: "+ s1.indexOf('i')); //index Of character
		
		String s2 = "I like java programming language. Java is very good language";
		
		System.out.println("IndexOf: "+ s2.indexOf("java")); //inex of string
		System.out.println("Index of : "+ s2.lastIndexOf("java")); // last index of string
		System.out.println("Is Empty: "+ s2.isEmpty()); // is empty
		System.out.println("replace: "+  s2.replace("java", "python")); // replace
        System.out.println("ToUppercase : "+ s2.toUpperCase()); // uppercase
        System.out.println("Substring : "+  s2.substring(7)); // substring
        System.out.println("Substring : "+  s2.substring(0,11)); // substring
        
        
        String s3="welcome to my class  ";
        System.out.println("before trim : "+ s3.length());
        System.out.println(s3);
        System.out.println("After trim : "+ s3.trim().length()); // trim
        System.out.println(s3.trim());
        
        String s4="welcome-to-my-class";
        String[] s5= s4.split("-"); // split
        
        for(String ss : s5) {
        	System.out.println(ss);
        }

     
        String s6= String.join("  ", "welcome","to","my","class");
        System.out.println(s6);

	}

}

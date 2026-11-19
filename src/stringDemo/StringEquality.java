package stringDemo;

public class StringEquality {

	public static void main(String[] args) {
		String s1="Heena";
        String s2="heena";
        
        System.out.println("is equal or  not : "+  (s1==s2));
        System.out.println("is equal or not : "+ s1.equals(s2));
        System.out.println("is equal or not : "+ s1.equalsIgnoreCase(s2));

        String s3=new String("Heena").intern();
     
        System.out.println("is equal or not : "+ (s1==s3));
        System.out.println("start with: "+  s1.startsWith("H"));
        System.out.println("start with: "+  s1.endsWith("h"));

	}

}

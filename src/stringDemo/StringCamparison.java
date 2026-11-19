package stringDemo;

public class StringCamparison {

	public static void main(String[] args) {
		String s1="Paneer";
        String s2="Butter";
        String s11="Paneer";
        String s22="butter";
        
        System.out.println(s1.compareTo(s2));
	    System.out.println(s2.compareTo(s1));
	    System.out.println(s1.compareTo(s11));
	  
	    String s12="Abbb";
	    System.out.println(s12.compareTo(s22));

	}

}

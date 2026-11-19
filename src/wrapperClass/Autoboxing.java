package wrapperClass;

public class Autoboxing {
	public static void main(String[] args) {
	    
        int x=10;
        
        System.out.println(x);  //10   
        
        Integer obj= x;  //autoboxing
        
        System.out.println(obj);  //10   
        
        Integer obj1 =Integer.valueOf(x);
        
        System.out.println(obj);
        

    }

}

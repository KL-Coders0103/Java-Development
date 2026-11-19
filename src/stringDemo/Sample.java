package stringDemo;

public class Sample {
	public static void main(String[] args) {
		char n1[] = {'H','e','l','l','o'};
		System.out.println(n1);
	        
	    //using String literal
	    String s1="Hello";
	    String s11="Hello";  //const string pool memory
	    System.out.println(s1);
	    System.out.println("Comapre :"+  (s1==s11));
	        
	    //using new keyword
	    String s2= new String("Hello");
	    String s22=new String("Hello");   //non pool memory (heap) 
	    System.out.println(s2);
	    System.out.println("Comapre :"+  (s2==s22));
	        
	    System.out.println("Comapre :"+  (s1==s2));
	    System.out.println("Length : "+ s1.length());
	    
	    String name = "Meena";
	    name.concat(" Roy");
	    System.out.println("After concatination: "+name);
	    
	    // way to mutable string are:- take another variable 
	    String nn = name.concat(" Roy");
	    System.out.println("After concatination: "+nn);
	    
	    //Another way is realloating data to same variable
	    name = name.concat(" Roy");
	    System.out.println("After concatination: "+name);
	}
}

/*
 *  String literal stores the data in string constance pool memory
 *  It checks the pool memory ... if string exits then it refere that object otherwise create a new object and refere that
 *  This helps to save the memory utilization and enhance the performnace of the program especially when there are multiple usage of the same string
 
 *  Strings are immutable :- the value of the string cannot be modified 
 *  This feature is deliberatelty choice to the thread safety, consisitency and efficiency
 *  Regarlesss of pool mechanism
 */

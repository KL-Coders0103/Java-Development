package typeCasting;

public class Narrowing {
	public static void main(String[] args) {
    
    //narrowing type casting  larger to smaller    
           double val =10.75;
           
           System.out.println("val: "+ val);
           
           
           int num = (int)val;
           
           System.out.println("num : "+ num);
           
           
           byte x='A';
              byte y=65;
              System.out.println(" x: "+ (char)x);
              System.out.println(" y: "+ (char) y);  
              
              char n1='B';
              
              System.out.println("n1: "+ n1+"  "+(int)n1);
              
    

    
    }

}

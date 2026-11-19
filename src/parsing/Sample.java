package parsing;

public class Sample {
	public static void main(String[] args) {
	 //parsing in java it means converting a string into another data type usually  a primitive type
	        
          String s="100";
          System.out.println(s+1);// 1001
          
          int num = Integer.parseInt(s);
          System.out.println(num+1);
          
          String x ="10.5";
          double y=Double.parseDouble(x);
          System.out.println(y);
          
          String n1 ="10";
          byte n2= Byte.parseByte(n1);
          System.out.println(n2);
          
          String h1="true";
          System.out.println(Boolean.parseBoolean(h1));
          
          
    }

}

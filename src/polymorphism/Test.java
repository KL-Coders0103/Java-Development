package polymorphism;

public class Test {

	public static void main(String[] args) {
		
//		 Calculate c1=new Calculate ();
//	     c1.Add();
//	     c1.Add(2, 30);
//	     c1.Add(2, 7.80f);
//	     c1.Add(2.3f, 20);
	     
//	     HDFC h1= new HDFC();
//       h1.ROI();
//
//       AXIS a1= new AXIS();
//       a1.ROI();
//    
 
//       UpCasting:- Object made of child class but it refer to parent class type
//		 syntax:- parentClass ReferenceVaribale = new childClass(); 
         Bank  b1;
         b1=new HDFC();
         b1.ROI();
       
         b1=new AXIS();
         b1.ROI();

	}

}

package interfaces;

public class Test1 {

	public static void main(String[] args) {
		Payment p=new UPI();
        p.pay(20000);
        p.receipt();
        
        Payment p1 =new CreditCard();
        p1.pay(3456);
        p1.receipt();
        
        Payment p2 =new Cash();
        p2.pay(30000);
        p2.receipt();
        
        Payment.validateAmount(10);
//      UPI.validateAmount(); compil time error   
//   // can an implemenating class (child) access an interface static method?
//
//      -> yes ,it can call it using the interface name,but
//      the static method is not inherited by the implementaiong class and cannot be called through the implementing class name or object.
//      

	}

}

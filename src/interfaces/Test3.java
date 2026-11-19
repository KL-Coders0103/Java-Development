package interfaces;

public class Test3 {

	public static void main(String[] args) {
		UpiPay u = new UpiPay();
		u.pay();
		u.ref();
		
		CashPay c = new CashPay();
		c.pay();
		

	}

}

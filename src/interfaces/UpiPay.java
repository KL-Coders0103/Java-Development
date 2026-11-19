package interfaces;

public class UpiPay implements OnlinePay{

	@Override
	public void pay() {
		System.out.println("Pay through UPI");
		
	}

	@Override
	public void ref() {
		System.out.println("Refund provided to your upi account");
		
	}

}

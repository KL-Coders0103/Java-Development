package looseCoupling;

public class CreditCard implements Payment{

	@Override
	public void pay() {
			System.out.println("Payment is done by Credit Card");
	}
}

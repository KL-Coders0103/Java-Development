package interfaces;

public class Cash implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Payment  " +amount +" done using Cash");
        
    }

    //we dont override recipt()
    //so cash will use default recipt
}

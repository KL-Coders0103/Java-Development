package interfaces;

public class CreditCard implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Payment  " +amount +" done using creaditCard");
        
    }
    
    public void receipt()
    {
        System.out.println("Credit card payment Recept");
        System.out.println("Status : successfully");
    
    }
}

package factory;

public class CreditCardPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Paid through credit CardPayment");
    }
}

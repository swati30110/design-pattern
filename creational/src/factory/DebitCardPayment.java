package factory;

public class DebitCardPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Paid By Debit card");
    }
}

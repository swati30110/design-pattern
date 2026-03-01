package factory;

import factory.enums.PaymentType;

public class PaymentFactory {
    public static Payment createPayment(PaymentType paymentType){
        switch(paymentType){
            case CREDIT: {
                return new CreditCardPayment();
            }
            case DEBIT:{
                return new DebitCardPayment();
            }
            default:
                throw new IllegalArgumentException("Invalid Payment Type");
        }
    }
}

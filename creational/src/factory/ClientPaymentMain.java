package factory;

import factory.enums.PaymentType;

public class ClientPaymentMain {
    public static void main(String[] args) {
        Payment creditPayment = PaymentFactory.createPayment(PaymentType.CREDIT);
        creditPayment.pay();
        Payment debitPayment = PaymentFactory.createPayment(PaymentType.DEBIT);
        debitPayment.pay();
    }
}

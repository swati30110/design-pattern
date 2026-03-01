package factory;

import factory.enums.PaymentType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentFactoryA {
    private static final Map<PaymentType, Supplier<Payment>> registry = new HashMap<>();
    static {
        registry.put(PaymentType.CREDIT, CreditCardPayment::new);
        registry.put(PaymentType.DEBIT, DebitCardPayment:: new);
    }

    public static Payment createPayment(PaymentType paymentType){
        Supplier<Payment> supplier = registry.get(paymentType);
        if(paymentType == null){
            throw new IllegalArgumentException("Invalid Payment type");
        }
        return supplier.get();
    }
}

package adaptor;

public class PaymentAdapter implements PaymentProcessor{
    private LegacyPaymentService legacyPaymentService;
    public PaymentAdapter(LegacyPaymentService legacyPaymentService){
        this.legacyPaymentService = legacyPaymentService;
    }
    @Override
    public void pay(double amount) {
        legacyPaymentService.makePayment(amount);
    }
}

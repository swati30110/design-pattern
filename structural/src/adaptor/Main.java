package adaptor;

public class Main {
    public static void main(String[] args) {
        LegacyPaymentService legacyPaymentService = new LegacyPaymentService();
        PaymentProcessor processor = new PaymentAdapter(legacyPaymentService);

        processor.pay(1000);
    }
}

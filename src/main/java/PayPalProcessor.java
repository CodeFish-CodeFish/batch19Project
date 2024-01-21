public class PayPalProcessor extends PaymentProcessor {
    @Override
    void processPayment() {
        System.out.println("Processing payment using PayPal");
    }

    @Override
    void cancelPayment() {
        System.out.println("Canceling the PayPal payment.");
    }

    @Override
    boolean isPaymentOver50Dollars() {
        return false;
    }

}

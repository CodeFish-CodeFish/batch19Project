public class ZellesProcessor extends PaymentProcessor {

    double paymentAmount;

    @Override
    void processPayment() {
        System.out.println("Processing the payment using Zelles.");
    }

    @Override
    void cancelPayment() {
        System.out.println("Canceling the Zelles payment.");
    }

    @Override
    boolean isPaymentOver50Dollars() {
        return paymentAmount > 50.00;
    }

    public static void main(String[] args) {
        ZellesProcessor zellesProcessor = new ZellesProcessor();
        zellesProcessor.getPaymentDetails();

        zellesProcessor.processPayment();
    }
}

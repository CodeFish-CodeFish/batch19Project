public class SamsungPhone extends GooglePaymentProcessor {


    @Override
    void processGooglePay() {

    }

    @Override
    void processPayment() {

    }

    public static void main(String[] args) {

        System.out.println(GooglePaymentProcessor.getPaymentType());

    }
}

public abstract class PaymentProcessor {

    double paymentAmount;

    abstract void processPayment();

    void cancelPayment(){
        System.out.println("Cancelling the payment.");
    }

    boolean isPaymentOver50Dollars(){
        return paymentAmount > 50.00;
    }

    public void getPaymentDetails(){
        System.out.println("Payment is getting processed.");
    }

    final double getPaymentAmount(){
        return paymentAmount;
    }
}

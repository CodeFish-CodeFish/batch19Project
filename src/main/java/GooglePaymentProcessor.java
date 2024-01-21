public abstract class GooglePaymentProcessor extends PaymentProcessor {

    private static double paymentFee;
    private double discount; // instance or non-static

    {
        discount = 0.1;
        paymentFee = 2.5;
    }

    static {
        paymentFee = 3.5;
    }

    private final static String paymentType = "Google Pay";

    abstract void processGooglePay();

    static String getPaymentType(){
        return paymentType;
    }

    double getPaymentFee(){
        return paymentFee;
    }

    /*
            * We cannot access non-static variable in static context ( static initializer, static method )
            * We can access both static and non-static variables in non-static context ( instance initializer, instance method )
     */
}

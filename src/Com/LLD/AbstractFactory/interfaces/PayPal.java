package Com.LLD.AbstractFactory.interfaces;

public class PayPal implements PaymentGateway{
    public void processPayment(double amount) {
        System.out.println("process by paypal");
    }
}

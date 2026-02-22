package Com.LLD.AbstractFactory.interfaces;

public class RazorPay implements PaymentGateway{
    public void processPayment(double amount) {
        System.out.println("proccess payment by Razorpay");
    }
}

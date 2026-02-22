package Com.LLD.AbstractFactory.interfaces;

public class Checkout {

    private PaymentGateway paymentGateway;
    private Invoice invoice;

    public Checkout(RegionFactory regionFactory, String paymentType) {
        this.paymentGateway= regionFactory.processPayment(paymentType);
        this.invoice = regionFactory.generateinvoice();
    }

    public void completeOrder(double amount) {
        paymentGateway.processPayment(amount);
        invoice.generateInvoice();
    }

}

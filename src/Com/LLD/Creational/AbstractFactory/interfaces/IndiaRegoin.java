package Com.LLD.Creational.AbstractFactory.interfaces;

public class IndiaRegoin implements RegionFactory {

    public PaymentGateway processPayment(String gatewayType) {
        if(gatewayType.equals("RazorPay")) {
            return new RazorPay();
        }
        // else eturn according to it.
        return new RazorPay();
    }
    public Invoice generateinvoice() {
        return new GSTInvoice();
    }
}

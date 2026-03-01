package Com.LLD.Creational.AbstractFactory.interfaces;

public class USRegion implements RegionFactory{

    public PaymentGateway processPayment(String gatewayType) {
        if(gatewayType.equals("PayPal")) {
            return new PayPal();
        }
        // else eturn according to it.
        return new PayPal();
    }
    public Invoice generateinvoice() {
        return new USInvoice();
    }
}

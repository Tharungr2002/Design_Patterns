package Com.LLD.AbstractFactory.interfaces;

public interface RegionFactory {
    PaymentGateway processPayment(String gatewayType);
    Invoice generateinvoice();
}

package Com.LLD.Creational.AbstractFactory.interfaces;

public interface RegionFactory {
    PaymentGateway processPayment(String gatewayType);
    Invoice generateinvoice();
}

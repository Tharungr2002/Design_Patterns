package Com.LLD.Creational.FactoryMethod;

import Com.LLD.Creational.FactoryMethod.Interface.Logistics;

public class LogisticsService {
    public void send(String mode) {
        Logistics factory = LogisticsFactory.send(mode);
        factory.send();
    }
}

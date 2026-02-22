package Com.LLD.FactoryMethod;

import Com.LLD.FactoryMethod.Interface.Logistics;

public class LogisticsService {
    public void send(String mode) {
        Logistics factory = LogisticsFactory.send(mode);
        factory.send();
    }
}

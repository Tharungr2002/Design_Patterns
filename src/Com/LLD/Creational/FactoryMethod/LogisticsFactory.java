package Com.LLD.Creational.FactoryMethod;

import Com.LLD.Creational.FactoryMethod.Interface.Logistics;

public class LogisticsFactory {
    public static Logistics send(String mode) {
        if(mode.equals("Air")) {
            return new Air();
        }
        else {
            return new Road();
        }
    }
}

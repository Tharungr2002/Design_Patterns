package Com.LLD.FactoryMethod;

import Com.LLD.FactoryMethod.Interface.Logistics;

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

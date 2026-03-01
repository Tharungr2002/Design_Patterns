package Com.LLD.Creational.FactoryMethod;

import Com.LLD.Creational.FactoryMethod.Interface.Logistics;

public class Air implements Logistics {
    public void send() {
        System.out.println("send by air");
    }
}

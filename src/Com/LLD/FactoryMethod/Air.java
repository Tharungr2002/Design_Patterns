package Com.LLD.FactoryMethod;

import Com.LLD.FactoryMethod.Interface.Logistics;

public class Air implements Logistics {
    public void send() {
        System.out.println("send by air");
    }
}

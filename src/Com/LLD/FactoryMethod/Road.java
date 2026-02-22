package Com.LLD.FactoryMethod;

import Com.LLD.FactoryMethod.Interface.Logistics;

public class Road implements Logistics {
    public void send() {
        System.out.println("send by Road");
    }
}

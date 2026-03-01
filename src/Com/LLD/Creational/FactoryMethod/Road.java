package Com.LLD.Creational.FactoryMethod;

import Com.LLD.Creational.FactoryMethod.Interface.Logistics;

public class Road implements Logistics {
    public void send() {
        System.out.println("send by Road");
    }
}

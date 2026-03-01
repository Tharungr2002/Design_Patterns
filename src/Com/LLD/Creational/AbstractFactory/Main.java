package Com.LLD.Creational.AbstractFactory;

import Com.LLD.Creational.AbstractFactory.interfaces.Checkout;
import Com.LLD.Creational.AbstractFactory.interfaces.IndiaRegoin;

public class Main{
    public static void main(String[] args) {
        Checkout obj1 = new Checkout(new IndiaRegoin(), "RazorPay");
        obj1.completeOrder(200);
    }
}
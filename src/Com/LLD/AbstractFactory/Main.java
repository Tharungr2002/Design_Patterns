package Com.LLD.AbstractFactory;

import Com.LLD.AbstractFactory.interfaces.Checkout;
import Com.LLD.AbstractFactory.interfaces.IndiaRegoin;

public class Main{
    public static void main(String[] args) {
        Checkout obj1 = new Checkout(new IndiaRegoin(), "RazorPay");
        obj1.completeOrder(200);
    }
}
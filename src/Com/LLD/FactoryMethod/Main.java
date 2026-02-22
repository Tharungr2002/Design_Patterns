package Com.LLD.FactoryMethod;

import Com.LLD.FactoryMethod.Interface.Logistics;

public class Main {
    public static void main(String[] args) {
        LogisticsService obj = new LogisticsService();
        obj.send("Air");
    }
}

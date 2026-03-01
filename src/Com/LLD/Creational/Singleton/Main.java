package Com.LLD.Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.newInstance();
        System.out.println(obj.count());

        Singleton obj2 = Singleton.newInstance();
        System.out.println(obj2.count());
    }
}

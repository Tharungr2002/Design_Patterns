package Com.LLD.Singleton;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.newInstance();
        System.out.println(obj.count());

        Singleton obj2 = Singleton.newInstance();
        System.out.println(obj2.count());
    }
}

package Com.LLD.Singleton;

public class Singleton {
    int count=0;
    public static volatile Singleton singleton;                    //it will have obj across all threads

    Singleton() {

    }
    public static Singleton newInstance() {
        if(singleton == null) {
            synchronized(Singleton.class){                   //only one thread at a time
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
    public int count() {
        count++;
        return count;
    }
}

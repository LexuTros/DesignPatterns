package singleton;

public class Singleton {
    private static Singleton uniqueInstance;
    // Alternative to instantiation in method:
    //private static final Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // non-static methods:...

}

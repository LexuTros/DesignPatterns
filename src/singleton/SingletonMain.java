package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton uniqueInstance = Singleton.getInstance();
        Singleton sameInstance = Singleton.getInstance();

        System.out.println(uniqueInstance == sameInstance);
    }

}

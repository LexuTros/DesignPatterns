package adapter;

public class AdapterMain {
    public static void main(String[] args) {

        Adaptee adaptee = new Adaptee();

        TargetInterface targetObject = new Adapter(adaptee);

        targetObject.neededMethod();
    }
}

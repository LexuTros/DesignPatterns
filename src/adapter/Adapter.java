package adapter;

public class Adapter implements TargetInterface{

    private Adaptee adaptee;

    public Adapter(Adaptee initialAdaptee) {
        this.adaptee = initialAdaptee;
    }

    @Override
    public void neededMethod() {
        adaptee.someEquivalentMethod();
    }

}

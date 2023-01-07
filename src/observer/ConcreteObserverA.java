package observer;

public class ConcreteObserverA implements Observer{

    @Override
    public void update(String newValue) {
        System.out.println("It was observed by Concrete Observer A, that the value of the Subject was set to:" + newValue);
    }

}

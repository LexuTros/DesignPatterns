package observer;

public class ConcreteObserverB implements Observer{

    @Override
    public void update(String newValue) {
        System.out.println("It was observed by Concrete Observer B, that the value of the Subject was set to:" + newValue);
    }

}

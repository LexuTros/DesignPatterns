package observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject{
    private final ArrayList<Observer> observers = new ArrayList<>();
    private String value;

    @Override
    public void registerObserver(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String newValue) {
        for (Observer observer : observers) {
            observer.update(newValue);
        }
    }

    public void setValue(String newValue) {
        this.value = newValue;
        notifyObservers(newValue);
    }

    public String getValue() {
        return value;
    }
}

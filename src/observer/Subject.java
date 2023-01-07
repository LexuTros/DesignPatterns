package observer;

public interface Subject {

    void registerObserver(Observer newObserver);

    void removeObserver(Observer observer);

    void notifyObservers(String newValue);

}

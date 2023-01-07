package observer;

public class ObserverMain {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();

        // only Observer A is registered
        subject.registerObserver(observerA);
        subject.setValue(" Value 1");
        System.out.println();

        // Observer A & B are registered
        subject.registerObserver(observerB);
        subject.setValue(" Value 2");
        System.out.println();

        // only Observer B is registered
        subject.removeObserver(observerA);
        subject.setValue(" Value 3");
        System.out.println();
    }
}

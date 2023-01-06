package state;

public class ConcreteStateA implements State{
    private final StatefulObject statefulObject;

    public ConcreteStateA(StatefulObject statefulObject) {
        this.statefulObject = statefulObject;
    }

    @Override
    public void handleActionOne() {
        System.out.println("Handling action 1, according to state A");
        System.out.println("This leads to the object entering state B");
        statefulObject.currentState = statefulObject.concreteStateB;
    }

    @Override
    public void handleActionTwo() {
        System.out.println("Handling action 2, according to state A");
    }
}

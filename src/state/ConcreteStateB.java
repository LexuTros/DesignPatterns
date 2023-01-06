package state;

public class ConcreteStateB implements State{
    private final StatefulObject statefulObject;

    public ConcreteStateB(StatefulObject statefulObject) {
        this.statefulObject = statefulObject;
    }

    @Override
    public void handleActionOne() {
        System.out.println("Handling action 1, according to state B");
    }

    @Override
    public void handleActionTwo() {
        System.out.println("Handling action 2, according to state B");
        System.out.println("This leads to the object entering state A");
        statefulObject.currentState = statefulObject.concreteStateA;
    }

}

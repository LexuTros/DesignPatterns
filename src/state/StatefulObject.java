package state;

public class StatefulObject {
    protected State concreteStateA;
    protected State concreteStateB;
    protected State currentState;

    public StatefulObject() {
        concreteStateA = new ConcreteStateA(this);
        concreteStateB = new ConcreteStateB(this);

        this.currentState = concreteStateA;
    }

    public void handleSituationOne() {
        currentState.handleActionOne();
    }

    public void handleSituationTwo() {
        currentState.handleActionTwo();
    }
}

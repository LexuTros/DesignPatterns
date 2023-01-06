package state;

public class StateMain {
    public static void main(String[] args) {

        State stateA = new ConcreteStateA();
        State stateB = new ConcreteStateB();

        StatefulObject aStatefulObject = new StatefulObject(stateA);

        aStatefulObject.handleSituationOne();

        aStatefulObject.setState(stateB);

        aStatefulObject.handleSituationTwo();
    }
}

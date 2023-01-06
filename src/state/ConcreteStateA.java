package state;

public class ConcreteStateA implements State{

    @Override
    public void handleActionOne() {
        System.out.println("Handling action 1, according to state A");
    }

    @Override
    public void handleActionTwo() {
        System.out.println("Handling action 2, according to state A");
    }
}

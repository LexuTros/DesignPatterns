package state;

public class ConcreteStateB implements State{

    @Override
    public void handleActionOne() {
        System.out.println("Handling action 1, according to state B");
    }

    @Override
    public void handleActionTwo() {
        System.out.println("Handling action 2, according to state B");
    }

}

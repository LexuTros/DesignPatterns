package strategy;

public class StrategyMain {
    public static void main(String[] args) {

        ConcreteBehaviorTwo two = new ConcreteBehaviorTwo();

        ConcreteStrategyObject object = new ConcreteStrategyObject();

        object.concreteObjectMethod();

        object.setBehavior(two);
        System.out.println("behavior was reassigned");

        object.executeBehavior();
    }
}

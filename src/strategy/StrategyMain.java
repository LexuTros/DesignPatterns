package strategy;

public class StrategyMain {
    public static void main(String[] args) {

        ConcreteBehaviorTwo two = new ConcreteBehaviorTwo();

        StrategyObject object = new StrategyObject();

        object.someMethod();

        object.setBehavior(two);
        System.out.println("behavior was reassigned");

        object.executeBehavior();
    }
}

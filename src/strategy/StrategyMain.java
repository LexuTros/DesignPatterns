package strategy;

public class StrategyMain {
    public static void main(String[] args) {

        StrategyObject object = new StrategyObject();
        ConcreteBehaviorTwo two = new ConcreteBehaviorTwo();

        object.someMethod();

        object.setBehavior(two);

        object.executeBehavior();
    }
}

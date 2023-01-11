package strategy;

public class StrategyMain {
    public static void main(String[] args) {

        StrategyObject object = new StrategyObject(); // standard initial Behavior is set to ConcreteBehaviorOne
        ConcreteBehaviorTwo two = new ConcreteBehaviorTwo();

        object.executeBehavior(); // One

        object.setBehavior(two);

        object.executeBehavior(); // Two
    }
}

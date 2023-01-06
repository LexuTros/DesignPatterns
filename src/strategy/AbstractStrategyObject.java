package strategy;

public abstract class AbstractStrategyObject {
    private BehaviorInterface variableBehavior;
     //possibly more variables

    public void setBehavior(BehaviorInterface concreteBehavior) {
        this.variableBehavior = concreteBehavior;
    }

    public void executeBehavior() {
        variableBehavior.execute();
    }

    // possibly more methods
}

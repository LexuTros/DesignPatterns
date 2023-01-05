package strategy;

public abstract class AbstractStrategyObject {
    private VariableBehaviorInterface variableBehavior;
     //possibly more variables

    public void setBehavior(VariableBehaviorInterface concreteBehavior) {
        this.variableBehavior = concreteBehavior;
    }

    public void executeBehavior() {
        variableBehavior.execute();
    }

    // possibly more methods
}

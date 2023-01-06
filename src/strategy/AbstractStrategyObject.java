package strategy;

public abstract class AbstractStrategyObject {
    protected BehaviorInterface variableBehavior;
     //possibly more variables

    public void setBehavior(BehaviorInterface concreteBehavior) {
        this.variableBehavior = concreteBehavior;
        System.out.println("behavior was reassigned");
    }

    public void executeBehavior() {
        variableBehavior.execute();
    }

    // possibly more methods
}

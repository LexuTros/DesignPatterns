package strategy;

public class StrategyObject {
    private BehaviorInterface variableBehavior;

    public StrategyObject(){
        this.variableBehavior = new ConcreteBehaviorOne();
    }

    public void setBehavior(BehaviorInterface concreteBehavior) {
        this.variableBehavior = concreteBehavior;
    }

    public void executeBehavior() {
        this.variableBehavior.execute();
    }

}

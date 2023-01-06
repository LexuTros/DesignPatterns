package strategy;

public class StrategyObject extends AbstractStrategyObject {

    // definition of initial variable behavior
    public StrategyObject(){
        this.setBehavior(new ConcreteBehaviorOne());
    }

    // object specific methods
    public void someMethod() {
        System.out.println("the concreteObjectMethod got executed, which now calls the set variable behavior:");
        executeBehavior();
        System.out.println("and after that the method ends");

    }
}

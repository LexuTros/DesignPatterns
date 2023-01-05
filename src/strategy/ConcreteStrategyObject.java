package strategy;

public class ConcreteStrategyObject extends AbstractStrategyObject {

    // definition of initial variable behavior
    public ConcreteStrategyObject(){
        this.setBehavior(new ConcreteBehaviorOne());
    }

    // object specific methods
    public void concreteObjectMethod() {
        System.out.println("the concreteObjectMethod got executed, which now calls the set variable behavior:");
        executeBehavior();
        System.out.println("and after that the method ends");

    }
}

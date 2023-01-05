package strategy;

public class ConcreteBehaviorTwo implements VariableBehaviorInterface {

    @Override
    public void execute() {
        System.out.println("concrete behavior number two got executed!");
    }

}

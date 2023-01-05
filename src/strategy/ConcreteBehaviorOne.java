package strategy;

public class ConcreteBehaviorOne implements VariableBehaviorInterface {

    @Override
    public void execute() {
        System.out.println("concrete behavior number one got executed!");
    }

}

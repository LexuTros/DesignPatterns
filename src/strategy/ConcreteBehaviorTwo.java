package strategy;

public class ConcreteBehaviorTwo implements BehaviorInterface {

    @Override
    public void execute() {
        System.out.println("behavior number two got executed!");
    }

}

package strategy;

public class ConcreteBehaviorOne implements BehaviorInterface {

    @Override
    public void execute() {
        System.out.println("behavior number one got executed!");
    }

}

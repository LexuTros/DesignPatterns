package strategy;

public class PewterArm implements MetalBurnBehavior{
    @Override
    public void burn() {
        System.out.println("These muscles go biiig!");
    }
}

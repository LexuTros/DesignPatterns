package strategy;

public class Mistborn implements MetalBurnBehavior{
    @Override
    public void burn() {
        System.out.println("Doing all the good stuff combined!");
    }
}

package strategy;

public class CoinShot implements MetalBurnBehavior {

    @Override
    public void burn() {
        System.out.println("That metal goes flying!");
    }
}

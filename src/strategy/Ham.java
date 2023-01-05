package strategy;

public class Ham extends Allomancer{
    public Ham () {
        setMetalBurnBehavior(new PewterArm());
        setFightBehavior(new GoodFighter());
    }
}

package strategy;

public class GoodFighter implements FightBehavior{
    @Override
    public void attack() {
        System.out.println("Smashes these enemy's!");
    }
}

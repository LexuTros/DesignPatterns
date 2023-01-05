package strategy;

public class NoFighter implements FightBehavior{
    @Override
    public void attack() {
        System.out.println("Runs or hides somewhere!");
    }
}

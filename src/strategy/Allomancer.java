package strategy;

public abstract class Allomancer {
    private MetalBurnBehavior metalBurnBehavior;
    private FightBehavior fightBehavior;


    public void setFightBehavior(FightBehavior fightBehavior) {
        this.fightBehavior = fightBehavior;
    }

    public void setMetalBurnBehavior(MetalBurnBehavior metalBurnBehavior) {
        this.metalBurnBehavior = metalBurnBehavior;
    }


    public void burnMetal() {
        metalBurnBehavior.burn();
    }

    public void fight() {
        fightBehavior.attack();
    }

}

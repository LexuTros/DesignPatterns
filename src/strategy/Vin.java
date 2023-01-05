package strategy;

public class Vin extends Allomancer{
    public Vin (){
        this.setMetalBurnBehavior(new Mistborn());
        this.setFightBehavior(new GoodFighter());
    }
}

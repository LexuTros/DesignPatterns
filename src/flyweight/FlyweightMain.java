package flyweight;

public class FlyweightMain {
    public static void main(String[] args) {

        Flyweight uniqueObjectOne = Flyweight.get(1);
        Flyweight sameObject = Flyweight.get(1);

        uniqueObjectOne.printValue();
        sameObject.printValue();
        System.out.println(uniqueObjectOne == sameObject);

    }
}

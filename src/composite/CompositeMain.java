package composite;

public class CompositeMain {
    public static void main(String[] args) {

        AbstractComponent aCompositeOne = new Composite(1);
        AbstractComponent aCompositeTwo = new Composite(2);

        AbstractComponent leafOne = new Leaf(3);
        AbstractComponent leafTwo = new Leaf(4);
        AbstractComponent leafThree = new Leaf(5);


        System.out.println("Leaf on its own:");
        leafOne.printID();
        System.out.println();

        leafOne.operation();


        System.out.println("Composite with added components:");
        aCompositeOne.addComponent(aCompositeTwo);
        aCompositeOne.addComponent(leafOne);
        aCompositeTwo.addComponent(leafTwo);
        aCompositeTwo.addComponent(leafThree);

        aCompositeOne.printID();
        System.out.println();

        aCompositeOne.operation();

        System.out.println("removing component nr. 3");
        aCompositeOne.removeComponent(aCompositeOne.getChild(1));
        aCompositeOne.printID();
    }
}

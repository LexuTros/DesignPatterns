package decorator;

public class ConcreteDecoratorA extends AbstractDecorator{

    public ConcreteDecoratorA(Component wrappedComponent) {
        super(wrappedComponent);
    }


    @Override
    public void operation() {
        super.wrappedObject.operation();
        System.out.println(" and also some additional operations, specified in the ConcreteDecoratorA");
    }

    @Override
    public String getDescription() {
        return super.wrappedObject.getDescription() +
                " + some additional Decorator A specific Information";
    }
}

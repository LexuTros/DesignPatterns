package decorator;

public class ConcreteDecoratorB extends AbstractDecorator{

    public ConcreteDecoratorB(Component wrappedComponent) {
        super(wrappedComponent);
    }


    // uses standard decorator method of operation()

    @Override
    public String getDescription() {
        return wrappedObject.getDescription() +
                " + some additional Decorator B specific Information";
    }
}

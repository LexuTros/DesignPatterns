package decorator;

public abstract class AbstractDecorator implements Component {

    protected final Component wrappedObject;

    public AbstractDecorator(Component wrappedComponent) {
        this.wrappedObject = wrappedComponent;
    }


    // override methods that will be handled the same across some Decorators
    @Override
    public void operation() {
        wrappedObject.operation();
        System.out.println(" and also some additional standard decorator operations");
    }

}

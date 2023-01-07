package decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Component aComponent = new ConcreteComponent();

        AbstractDecorator decoratedComponentWithA = new ConcreteDecoratorA(aComponent);
        AbstractDecorator decoratedDecoratorWithB = new ConcreteDecoratorB(decoratedComponentWithA);

        System.out.println(decoratedDecoratorWithB.getDescription());

        decoratedComponentWithA.operation();
    }
}

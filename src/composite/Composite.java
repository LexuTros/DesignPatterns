package composite;

import java.util.ArrayList;

public class Composite extends AbstractComponent{

    // Basic component functionality
    private final int id;

    public Composite(int idNumber) {
        this.id = idNumber;
    }
    @Override
    public void operation() {
        System.out.println("does some component operation as a composite");
    }

    @Override
    public void printID() {
        System.out.print("C" + this.id + " ");
        for (AbstractComponent component : childComponents) {
            component.printID();
        }
    }

    // Additional functionality of a Composite
    private final ArrayList<AbstractComponent> childComponents = new ArrayList<>();

    @Override
    public void addComponent(AbstractComponent component) {
        childComponents.add(component);
    }

    @Override
    public void removeComponent(AbstractComponent component) {
        childComponents.remove(component);
    }

    @Override
    public AbstractComponent getChild(int idx) {
        return childComponents.get(idx);
    }

}

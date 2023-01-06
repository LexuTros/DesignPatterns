package composite;

import java.util.ArrayList;

public class Composite extends AbstractComponent{
    private final int id;
    private final ArrayList<AbstractComponent> childComponents = new ArrayList<>();

    public Composite(int idNumber) {
        this.id = idNumber;
    }


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

}

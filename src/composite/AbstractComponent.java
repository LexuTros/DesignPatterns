package composite;

public abstract class AbstractComponent {

    public void operation() {
        throw new UnsupportedOperationException();
    }

    public void addComponent(AbstractComponent component) {
        throw new UnsupportedOperationException();
    }

    public void removeComponent(AbstractComponent component) {
        throw new UnsupportedOperationException();
    }

    public AbstractComponent getChild(int idx) {
        throw new UnsupportedOperationException();
    }

    public void printID() {
        throw new UnsupportedOperationException();
    }

}

package composite;

public class Leaf extends AbstractComponent{
    private final int id;

    public Leaf(int id) {
        this.id = id;
    }

    @Override
    public void operation() {
        System.out.println("performs some component operation as a leaf");
    }

    @Override
    public void printID() {
        System.out.print(this.id + " ");
    }
}

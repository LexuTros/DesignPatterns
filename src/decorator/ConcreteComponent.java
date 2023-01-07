package decorator;

public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("Component performs its operation");
    }

    @Override
    public String getDescription() {
        return "Some description of the concrete component";
    }
}

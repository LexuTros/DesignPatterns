package command;

public class ConcreteCommandTwo implements Command{
    @Override
    public void execute() {
        System.out.println("executes Command two, which might delegate some actions!");
    }

    @Override
    public void undo() {
        System.out.println("undoes what command two has done!");
    }
}

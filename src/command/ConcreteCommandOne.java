package command;

public class ConcreteCommandOne implements Command{

    @Override
    public void execute() {
        System.out.println("executes Command one, which might delegate some actions!");
    }

    @Override
    public void undo() {
        System.out.println("undoes what command one has done!");
    }
}

package command;

public class CommandMain {
    public static void main(String[] args) {
        Command one = new ConcreteCommandOne();
        Command two = new ConcreteCommandTwo();

        Invoker remote = new Invoker();

        remote.setNewCommand(1, one);
        remote.setNewCommand(2, two);

        remote.executeCommand(1);
        remote.executeCommand(2);
        remote.undoLastCommand();
    }
}

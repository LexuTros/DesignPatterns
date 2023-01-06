package command;

public class Invoker {
    // aka remoteControl
    private final Command[] commandSlots = new Command[10];
    private Command undoCommand;


    // error prone indexing!! (no checks what so ever)
    public void setNewCommand(int slot, Command newCommand) {
        commandSlots[slot] = newCommand;
    }

    public void executeCommand(int commandNumber) {
        commandSlots[commandNumber].execute();
        undoCommand = commandSlots[commandNumber];
    }

    public void undoLastCommand() {
        undoCommand.undo();
        // possible to implement with stack, to be able to undo more than one command
    }
}

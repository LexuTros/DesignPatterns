package command;

public class Invoker {
    // aka remoteControl
    private final Command[] commandSlots = new Command[10];
    private Command undoCommand;


    public void setNewCommand(int slot, Command newCommand) {
        // if slot index is valid:
        commandSlots[slot] = newCommand;
    }

    public void executeCommand(int commandNumber) {
        // if commandNumber is valid:
        commandSlots[commandNumber].execute();
        undoCommand = commandSlots[commandNumber];
    }

    public void undoLastCommand() {
        undoCommand.undo();
        // possible to implement with stack, to be able to undo more than one command
    }
}

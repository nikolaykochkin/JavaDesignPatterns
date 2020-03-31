package command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    private int length;

    public RemoteControl() {
        length = 7;
        onCommands = new Command[length];
        offCommands = new Command[length];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control ------\n");
        for (int i = 0; i < length; i++) {
            stringBuilder
                    .append("[slot ")
                    .append(i)
                    .append("]")
                    .append("\t")
                    .append(onCommands[i].getClass().getName())
                    .append("\t")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        stringBuilder.append("[undo]\t").append(undoCommand.getClass().getName()).append("\n");
        return stringBuilder.toString();
    }
}

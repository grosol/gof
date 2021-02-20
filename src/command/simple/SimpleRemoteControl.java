package command.simple;

import command.simple.commands.Command;

public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command command) {
        this.slot = command;
    }

    public void buttonWasPassed() {
        slot.execute();
    }
}

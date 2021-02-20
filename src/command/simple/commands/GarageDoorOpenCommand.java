package command.simple.commands;

import command.simple.devices.GarageDoor;

public class GarageDoorOpenCommand implements Command{
    private final GarageDoor garageDoor;


    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}

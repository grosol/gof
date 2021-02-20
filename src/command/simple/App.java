package command.simple;

import command.simple.commands.GarageDoorOpenCommand;
import command.simple.commands.LightOnCommand;
import command.simple.devices.GarageDoor;
import command.simple.devices.Light;

public class App {
    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());

        control.setSlot(lightOn);
        control.buttonWasPassed();
        control.setSlot(garageDoorOpenCommand);
        control.buttonWasPassed();
    }

}

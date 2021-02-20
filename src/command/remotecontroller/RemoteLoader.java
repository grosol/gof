package command.remotecontroller;

import command.remotecontroller.commands.*;
import command.remotecontroller.devices.GarageDoor;
import command.remotecontroller.devices.Light;
import command.remotecontroller.devices.Stereo;

public class RemoteLoader {
 
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
 
		Light light = new Light();
		Stereo stereo = new Stereo("Living Room");

		GarageDoor garageDoor = new GarageDoor();
  
		LightOnCommand livingRoomLightOn =
				new LightOnCommand(light);
		LightOffCommand livingRoomLightOff =
				new LightOffCommand(light);


 
		GarageDoorUpCommand garageDoorUp =
				new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown =
				new GarageDoorDownCommand(garageDoor);
 
		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff =
				new StereoOffCommand(stereo);
 
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, garageDoorUp, garageDoorDown);
		remoteControl.setCommand(2, stereoOnWithCD, stereoOff);
  
		System.out.println(remoteControl);
 
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
	}
}

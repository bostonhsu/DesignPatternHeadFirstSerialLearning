package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/6.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub("Alpha");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);
        HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);

        Command[] partyOn = { lightOnCommand, stereoOnWithCDCommand, tvOnCommand, hottubOnCommand };
        Command[] partyOff = {lightOffCommand, stereoOffCommand, tvOffCommand, hottubOffCommand };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("-----Pushing Macro On-----");
        remoteControl.onButtonWasPushed(0);
        System.out.println("-----Pushing Macro Off-----");
        remoteControl.offButtonWasPushed(0);
    }
}

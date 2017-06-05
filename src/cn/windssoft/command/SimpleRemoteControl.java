package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/5.
 */
public class SimpleRemoteControl {
    Command _slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        _slot = command;
    }

    public void buttonWasPressed() {
        _slot.execute();
    }
}

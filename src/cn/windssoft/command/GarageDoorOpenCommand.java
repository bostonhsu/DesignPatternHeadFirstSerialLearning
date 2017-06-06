package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/5.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor _garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        _garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        _garageDoor.up();
    }

    @Override
    public void undo() {
        _garageDoor.down();
    }
}

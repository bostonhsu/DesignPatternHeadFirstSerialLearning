package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/6.
 */
public class GarageDoorCloseCommand implements Command {
    GarageDoor _garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        _garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        _garageDoor.down();
    }

    @Override
    public void undo() {
        _garageDoor.up();
    }
}

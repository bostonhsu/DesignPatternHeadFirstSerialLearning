package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/6.
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan _ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        _ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        _ceilingFan.off();
    }
}

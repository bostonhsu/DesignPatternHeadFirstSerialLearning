package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/6.
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan _ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        _ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        _ceilingFan.low();
    }
}

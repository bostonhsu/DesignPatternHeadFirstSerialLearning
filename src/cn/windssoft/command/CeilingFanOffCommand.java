package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/6.
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan _ceilingFan;
    int _prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        _ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        _prevSpeed = _ceilingFan.getSpeed();
        _ceilingFan.off();
    }

    @Override
    public void undo() {
        if (_prevSpeed == CeilingFan.HIGH) {
            _ceilingFan.high();
        } else if (_prevSpeed == CeilingFan.MEDIUM) {
            _ceilingFan.medium();
        } else if (_prevSpeed == CeilingFan.LOW) {
            _ceilingFan.low();
        } else if (_prevSpeed == CeilingFan.OFF) {
            _ceilingFan.off();
        }
    }
}

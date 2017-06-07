package cn.windssoft.command;

/**
 * Created by Boston Hsu on 6/7/2017.
 */
public class CeilingFanMediumCommand implements Command {
    CeilingFan _ceilingFan;
    int _prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        _ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        _prevSpeed = _ceilingFan.getSpeed();
        _ceilingFan.medium();
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

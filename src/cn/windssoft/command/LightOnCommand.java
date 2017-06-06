package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/5.
 */
public class LightOnCommand implements Command {
    Light _light;

    public LightOnCommand(Light light) {
        _light = light;
    }

    @Override
    public void execute() {
        _light.on();
    }

    @Override
    public void undo() {
        _light.off();
    }
}

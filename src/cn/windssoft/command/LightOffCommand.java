package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/5.
 */
public class LightOffCommand implements Command {
    Light _light;

    public LightOffCommand(Light light) {
        _light = light;
    }

    @Override
    public void execute() {
        _light.off();
    }

    @Override
    public void undo() {
        _light.on();
    }
}

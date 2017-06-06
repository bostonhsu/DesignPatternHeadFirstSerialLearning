package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/6.
 */
public class StereoOffCommand implements Command {
    Stereo _stereo;

    public StereoOffCommand(Stereo stereo) {
        _stereo = stereo;
    }

    @Override
    public void execute() {
        _stereo.off();
    }
}

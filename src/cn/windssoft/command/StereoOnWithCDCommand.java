package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/6.
 */
public class StereoOnWithCDCommand implements Command {
    Stereo _stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        _stereo = stereo;
    }

    @Override
    public void execute() {
        _stereo.on();
        _stereo.setCd(new CD());
        _stereo.setVolume(11);
    }
}

package cn.windssoft.command;

/**
 * Created by Boston Hsu on 6/7/2017.
 */
public class HottubOffCommand implements Command {
    private Hottub _hottub;

    public HottubOffCommand(Hottub hottub) {
        _hottub = hottub;
    }

    @Override
    public void execute() {
        _hottub.off();
    }

    @Override
    public void undo() {
        _hottub.on();
    }
}

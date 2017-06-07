package cn.windssoft.command;

/**
 * Created by Boston Hsu on 6/7/2017.
 */
public class TVOffCommand implements Command {
    private TV _tv;

    public TVOffCommand(TV tv) {
        _tv = tv;
    }

    @Override
    public void execute() {
        _tv.off();
    }

    @Override
    public void undo() {
        _tv.on();
    }
}

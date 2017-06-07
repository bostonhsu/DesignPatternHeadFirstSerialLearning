package cn.windssoft.command;

/**
 * Created by Boston Hsu on 6/7/2017.
 */
public class TVOnCommand implements Command{
    private String _name;
    private TV _tv;

    public TVOnCommand(String name) {
        _name = name;
    }

    public TVOnCommand(TV tv) {
        _tv = tv;
    }

    @Override
    public void execute() {
        _tv.on();
    }

    @Override
    public void undo() {
        _tv.off();
    }
}

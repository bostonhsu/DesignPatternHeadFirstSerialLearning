package cn.windssoft.command;

/**
 * Created by Boston Hsu on 6/7/2017.
 */
public class HottubOnCommand implements Command{
    private Hottub _hottub;

    public HottubOnCommand(Hottub hottub) {
        _hottub = hottub;
    }

    @Override
    public void execute() {
        _hottub.on();
    }

    @Override
    public void undo() {
        _hottub.off();
    }
}

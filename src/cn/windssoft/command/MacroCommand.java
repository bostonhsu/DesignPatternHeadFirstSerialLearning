package cn.windssoft.command;

/**
 * Created by Boston Hsu on 6/7/2017.
 */
public class MacroCommand implements Command {
    Command[] _commands;

    public MacroCommand(Command[] commands) {
        _commands = commands;
    }
    @Override
    public void execute() {
        for (int i = 0; i < _commands.length; i++) {
            _commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < _commands.length; i++) {
            _commands[i].undo();
        }
    }
}

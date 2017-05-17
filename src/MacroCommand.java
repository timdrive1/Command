/**
 * Created by student on 17.05.2017.
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override

    public void execute() {
        for (int i = 0; i < commands.length ; i++) {
            commands[i].execute();
        }

    }

    @Override
    public void undo() {

    }
}

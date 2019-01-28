package patterns.command.example_2;

/**
 * Created by Home on 04.12.2016.
 */
public class TVOffCommand implements Command{
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}

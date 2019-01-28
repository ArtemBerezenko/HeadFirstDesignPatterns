package patterns.command.example_2;

/**
 * Created by Home on 04.12.2016.
 */
public class HottubOffCommand implements Command{
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }


    @Override
    public void execute() {
        hottub.jetsOff();
    }

    @Override
    public void undo() {
        hottub.jetsOn();
    }
}

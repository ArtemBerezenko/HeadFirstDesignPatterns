package patterns.command.example_2;

/**
 * Created by Home on 04.12.2016.
 */
public class HottubOnCommand implements Command{
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }


    @Override
    public void execute() {
        System.out.println("Hottub is on");
    }

    @Override
    public void undo() {

    }
}

package patterns.command.example_1;


/**
 * Created by Home on 02.12.2016.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

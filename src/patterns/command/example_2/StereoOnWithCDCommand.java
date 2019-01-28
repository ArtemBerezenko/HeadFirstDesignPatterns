package patterns.command.example_2;

/**
 * Created by Home on 02.12.2016.
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute(){
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {

    }

}

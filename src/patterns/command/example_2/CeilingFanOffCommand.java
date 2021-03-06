package patterns.command.example_2;

/**
 * Created by Home on 03.12.2016.
 */
public class CeilingFanOffCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();

    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.HIGH){
            ceilingFan.hight();
        } else if(prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        } else if(prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        } else if(prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}

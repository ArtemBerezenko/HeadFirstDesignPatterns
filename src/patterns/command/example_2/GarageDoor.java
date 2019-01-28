package patterns.command.example_2;

/**
 * Created by Home on 02.12.2016.
 */
public class GarageDoor {
    public void up(){
        System.out.println("Garage Door is Open");
    }
    public void down(){
        System.out.println("Garage Door is Close");
    }
    public void stop(){}
    public void lightOn(){}
    private void lightOff(){}
}

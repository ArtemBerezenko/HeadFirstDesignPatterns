package patterns.command.example_2;

/**
 * Created by Home on 02.12.2016.
 */
public class Stereo {

    private String string;

    public Stereo(String s) {
        this.string = s;
    }

    public void on() {
        System.out.println("stereo is on");
    }


    public void setCD() {
        System.out.println("stereo is set for CD input");
    }


    public void setVolume(int i) {
        System.out.println("stereo volume set to " + i);
    }

    public void off() {
        System.out.println("stereo is off");
    }
}

package Patterns.Command.Example_2;

/**
 * Created by Home on 02.12.2016.
 */
public class Light {
    private String string;

    public Light(String string) {
        this.string = string;
    }

    public void on(){
        System.out.println("Light is On!");
    }

    public void off(){
        System.out.println("Light is Off!");
    }

}

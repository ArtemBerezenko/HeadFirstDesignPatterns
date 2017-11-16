package Patterns.Command.Example_2;

/**
 * Created by Home on 04.12.2016.
 */
public class TV {
    private String location;

    public TV(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println("TV is On");
    }

    public void off(){
        System.out.println("TV is Off");
    }

    public void setInputChannel(){

    }

    public void setVolume(){

    }


}

package Patterns.Command.Example_2;

/**
 * Created by Home on 03.12.2016.
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 3;
    public static final int OFF = 0;
    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void hight(){
        speed = HIGH;
        System.out.println("ceiling fan on hight");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("ceiling fan on medium");
    }

    public void low(){
        speed = LOW;
        System.out.println("ceiling fan on low");
    }

    public void off(){
        speed = OFF;
        System.out.println("ceiling fan is off");
    }

    public int getSpeed(){
        return speed;
    }
}

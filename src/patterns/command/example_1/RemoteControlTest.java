package patterns.command.example_1;

/**
 * Created by Home on 02.12.2016.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        CoffeeMachineCommand esspresso = new CoffeeMachineCommand(coffeeMachine);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
        remote.setCommand(esspresso);
        remote.buttonWasPressed();
    }
}

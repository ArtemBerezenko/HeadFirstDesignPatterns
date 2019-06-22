package patterns.command.example_1;

public class CoffeeMachineCommand implements Command{
    private CoffeeMachine coffeeMachine;

    public CoffeeMachineCommand(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void execute() {
        coffeeMachine.createEspresso();
    }
}

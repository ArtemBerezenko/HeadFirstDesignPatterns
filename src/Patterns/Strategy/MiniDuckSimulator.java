package Patterns.Strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new MallardDuck();
        model.performFly();
        model.setFlyBehavior(new FlyNoWay());
        model.performFly();
    }
}

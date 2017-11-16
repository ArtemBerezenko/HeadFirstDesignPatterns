package Patterns.Strategy;

public class Quack implements QuakBehavior {
    @Override
    public void quak() {
        System.out.println("Quack");
    }
}

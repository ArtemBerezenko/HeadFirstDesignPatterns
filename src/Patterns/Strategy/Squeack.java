package Patterns.Strategy;

public class Squeack implements QuakBehavior {
    @Override
    public void quak() {
        System.out.println("Squeack");
    }
}

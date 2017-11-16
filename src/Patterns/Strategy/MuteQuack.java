package Patterns.Strategy;

public class MuteQuack implements QuakBehavior {
    @Override
    public void quak() {
        System.out.println("<< Silence >>");
    }
}

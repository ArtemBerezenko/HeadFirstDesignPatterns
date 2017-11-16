package Patterns.MVC.NotMVC;

/**
 * Created by Home on 11.12.2016.
 */
public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {
    }

    @Override
    public void notifyObservers() {

    }
}

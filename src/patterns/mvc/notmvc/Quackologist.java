package patterns.mvc.notmvc;

/**
 * Created by Home on 11.12.2016.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}

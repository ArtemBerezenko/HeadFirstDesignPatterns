package patterns.combined.notmvc;

/**
 * Created by Home on 11.12.2016.
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}

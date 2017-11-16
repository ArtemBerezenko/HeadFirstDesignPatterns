package Patterns.Observer.Observer;

/**
 * Created by Home on 10.12.2016.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

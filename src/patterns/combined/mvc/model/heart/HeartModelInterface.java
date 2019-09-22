package patterns.combined.mvc.model.heart;

import patterns.combined.mvc.observer.BPMObserver;
import patterns.combined.mvc.observer.BeatObserver;

/**
 * Created by Home on 11.12.2016.
 */
public interface HeartModelInterface {
    int getHeartRate();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}

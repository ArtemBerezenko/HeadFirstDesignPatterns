package patterns.combined.mvc.model.beat;

import patterns.combined.mvc.observer.BPMObserver;
import patterns.combined.mvc.observer.BeatObserver;

/**
 * Created by Home on 11.12.2016.
 */
public interface BeatModelInterface {
    void initialize();
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}

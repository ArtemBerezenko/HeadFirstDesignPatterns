package patterns.mvc.mvc.model;

import patterns.mvc.mvc.BPMObserver;
import patterns.mvc.mvc.BeatObserver;

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

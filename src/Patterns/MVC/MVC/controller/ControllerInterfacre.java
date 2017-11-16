package Patterns.MVC.MVC.controller;

/**
 * Created by Home on 11.12.2016.
 */
public interface ControllerInterfacre {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}

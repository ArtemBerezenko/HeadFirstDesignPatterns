package patterns.combined.mvc.controller.beat;

import patterns.combined.mvc.controller.ControllerInterfacre;
import patterns.combined.mvc.model.beat.BeatModelInterface;
import patterns.combined.mvc.view.DJView;

/**
 * Created by Home on 11.12.2016.
 */
public class BeatController implements ControllerInterfacre {
    private BeatModelInterface model;
    private DJView view;

    public BeatController(BeatModelInterface model) {
        this.model = model;
        view = new DJView(this, model);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.initialize();
    }

    @Override
    public void start() {
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    @Override
    public void stop() {
        model.off();
        view.disableStartMenuItem();
        view.enableStartMenuItem();
    }

    @Override
    public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 1);
    }

    @Override
    public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm - 1);
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }
}

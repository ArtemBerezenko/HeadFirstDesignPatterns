package patterns.combined.mvc.controller.heart;

import patterns.combined.mvc.controller.ControllerInterfacre;
import patterns.combined.mvc.model.heart.HeartAdapter;
import patterns.combined.mvc.model.heart.HeartModelInterface;
import patterns.combined.mvc.view.DJView;

/**
 * Created by Home on 11.12.2016.
 */
public class HeartController implements ControllerInterfacre {
    private HeartModelInterface model;
    private DJView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void increaseBPM() {

    }

    @Override
    public void decreaseBPM() {

    }

    @Override
    public void setBPM(int bpm) {

    }
}

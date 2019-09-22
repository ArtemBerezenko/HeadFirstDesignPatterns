package patterns.combined.mvc;

import patterns.combined.mvc.controller.beat.BeatController;
import patterns.combined.mvc.controller.ControllerInterfacre;
import patterns.combined.mvc.model.beat.BeatModel;
import patterns.combined.mvc.model.beat.BeatModelInterface;

/**
 * Created by Home on 11.12.2016.
 */
public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterfacre controller = new BeatController(model);
    }
}

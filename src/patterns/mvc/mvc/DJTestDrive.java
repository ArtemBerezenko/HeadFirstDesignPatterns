package patterns.mvc.mvc;

import patterns.mvc.mvc.controller.beat.BeatController;
import patterns.mvc.mvc.controller.ControllerInterfacre;
import patterns.mvc.mvc.model.beat.BeatModel;
import patterns.mvc.mvc.model.beat.BeatModelInterface;

/**
 * Created by Home on 11.12.2016.
 */
public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterfacre controller = new BeatController(model);
    }
}

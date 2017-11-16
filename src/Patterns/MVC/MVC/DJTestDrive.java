package Patterns.MVC.MVC;

import Patterns.MVC.MVC.controller.BeatController;
import Patterns.MVC.MVC.controller.ControllerInterfacre;
import Patterns.MVC.MVC.model.BeatModel;
import Patterns.MVC.MVC.model.BeatModelInterface;

/**
 * Created by Home on 11.12.2016.
 */
public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterfacre controller = new BeatController(model);
    }
}

package Patterns.MVC.MVC;

import Patterns.MVC.MVC.controller.ControllerInterfacre;
import Patterns.MVC.MVC.controller.HeartController;
import Patterns.MVC.MVC.model.HeartModel;

/**
 * Created by Home on 11.12.2016.
 */
public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterfacre model = new HeartController(heartModel);
    }
}

package patterns.mvc.mvc;

import patterns.mvc.mvc.controller.ControllerInterfacre;
import patterns.mvc.mvc.controller.heart.HeartController;
import patterns.mvc.mvc.model.heart.HeartModel;

/**
 * Created by Home on 11.12.2016.
 */
public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterfacre model = new HeartController(heartModel);
    }
}

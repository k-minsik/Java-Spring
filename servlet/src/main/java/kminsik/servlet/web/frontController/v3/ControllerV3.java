package kminsik.servlet.web.frontController.v3;

import kminsik.servlet.web.frontController.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}

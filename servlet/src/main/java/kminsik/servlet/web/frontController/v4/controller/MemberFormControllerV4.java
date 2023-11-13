package kminsik.servlet.web.frontController.v4.controller;

import kminsik.servlet.web.frontController.ModelView;
import kminsik.servlet.web.frontController.v4.ControllerV4;

import java.util.Map;
import java.util.Objects;

public class MemberFormControllerV4 implements ControllerV4 {
    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        return "new-form";
    }
}

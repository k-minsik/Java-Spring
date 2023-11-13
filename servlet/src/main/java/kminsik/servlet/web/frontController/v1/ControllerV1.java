package kminsik.servlet.web.frontController.v1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kminsik.servlet.web.frontController.MyView;

import java.io.IOException;

public interface ControllerV1 {

    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}

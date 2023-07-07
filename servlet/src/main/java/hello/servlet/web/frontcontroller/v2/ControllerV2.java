package hello.servlet.web.frontcontroller.v2;

import hello.servlet.web.frontcontroller.MyView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV2 {

    //v1과의 차이점, render() 메세지 반환
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}

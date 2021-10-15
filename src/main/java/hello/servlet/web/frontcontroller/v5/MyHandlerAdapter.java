package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.ModelView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface MyHandlerAdapter {

    /**
     * handler > controller
     * 어댑터가 해당 컨트롤러를 처리할 수 있는지 판단
     * @param handler
     * @return
     */
    boolean supports(Object handler);

    /**
     * 실제 컨트롤러 호출, 결과로 ModelView 반환
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws ServletException
     * @throws IOException
     */
    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;
}

package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
- HandlerMapping: 빈 이름으로 핸들러를 찾음
- HandlerAdapter: 핸들러 매핑을 통해서 찾은 핸들러를 실행
1. 핸들러 매핑으로 핸들러 조회
2. 핸들러 어댑터 조회
3. 핸들러 어댑터 실행
 */
@Component("/springmvc/old-controller")
public class OldController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");
        return new ModelAndView("new-form");
    }
}

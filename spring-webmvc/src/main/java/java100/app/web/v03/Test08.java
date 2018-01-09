// 세션 다루기 - @SessionAttributes 애노테이션 사용 
//
package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/v03/test08")

// Model 객체에 보관되는 값은 프론트 컨트롤러가 JSP를 실행하기 전에 
// ServletRequest 보관소에 복사를 하는데,
// 다음 애노테이션에 지정된 값은 세션 보관소에도 복사한다.
@SessionAttributes({"name","age"})
public class Test08 {
    
    @RequestMapping(value="/m1", produces="text/plain;charset=UTF-8")
    public String m1(HttpSession session, Model model) {
        
        model.addAttribute("name", "홍길동");
        model.addAttribute("age", 20); // auto-boxing : Integer 객체 저장
        model.addAttribute("working", true); // auto-boxing : Boolean 객체 저장
        
        session.setAttribute("working", true);
        return "v03/test08/m1";
    }
    
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    public String m2(HttpSession session) {
        session.invalidate();   //세션을 초기화시켜주는 작업을한다.
        
        return "v03/test08/m1";
    }
    
    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    public String m3(SessionStatus status, HttpSession session) {
        session.invalidate();
        status.setComplete();
        
        return "v03/test08/m1";
    }
    
}











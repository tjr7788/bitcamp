// @RequestMapping - Content-Type 요청 헤더의 값에 따라 구분하기
//
package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller     //일반 @Controller가 아닌 @RestController를 붙이게되면 @RequestBody를 생략해도된다.
@RequestMapping("/v03/test06")
public class Test06 {

    @RequestMapping(value="/m1", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m1(HttpSession session) {
        session.setAttribute("name", "홍길동");
        session.setAttribute("age", 20);
        session.setAttribute("working", true);
        return "세선에 값을 저장하였습니다.";
    }
    
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m2(HttpSession session) {
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name=%s\n", session.getAttribute("name")));
        buf.append(String.format("age=%s\n", session.getAttribute("age")));
        buf.append(String.format("working=%s\n", session.getAttribute("working")));
        
        
        return buf.toString();
    }
}











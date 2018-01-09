// 세션 다루기 - @SessionAttributes 애노테이션 사용 
//
package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/v03/test09")
//@SessionAttributes({"name","age"})
public class Test09 {
    
    @RequestMapping(value="/m1", produces="text/plain;charset=UTF-8")
    public String m1(HttpSession session, Model model) {
        
        return "v03/test08/m1";
    }
    
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    public String m2(
            @ModelAttribute("name") String name,
            @ModelAttribute("age") int age) {
        
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name=%s\n", name));
        buf.append(String.format("name=%d\n", age));
        
        return buf.toString();
    }
}


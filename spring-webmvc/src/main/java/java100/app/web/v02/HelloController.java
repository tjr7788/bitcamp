package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello() {
        return "/hello.jsp";
    }
}

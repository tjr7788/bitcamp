// @RequestMapping - Content-Type 요청 헤더의 값에 따라 구분하기
//
package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test18")
public class Test18 {

    @RequestMapping("/m1")
    public String m1() {
        return "/test18/m1";
    }
    
}











// @RequestMapping - Content-Type 요청 헤더의 값에 따라 구분하기
//
package java100.app.web.v03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

@Controller
@RequestMapping("/v03/test01")
public class Test01 {

    @RequestMapping("/m1")
    public String m1() {
        return "/test01/m1";
    }
    
    @RequestMapping("/m2")
    public void m2() {
        System.out.println("m2()");
    }
    @RequestMapping("/m3")
    public View m3() {
        System.out.println("m3()");
        
        View view = new InternalResourceView("/v03/test01/m3.jsp");      //url정보를 담아서 넘겨줄수있다.
        return view;
    }
}











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
@RequestMapping("/v03/test07")

// @SessionAttributes에 이름을 지정하면 요청이 들어올 때 다음과 같이 동작한다.
// => 요청 핸들러의 호출이 끝났을 때
//    1) 요청 핸들러에서 Model 객체에 그 이름의 값을 보관했을 경우
//       - Model 객체에 보관된 값은 ServletRequest 보관소에 복사를 한다.
//       - 또한 HttpSession 객체에도 복사한다.
//    2) 요청 핸들러에서 Model 객체에 그 이름으로 값을 보관하지 않았을 경우,
//       - HttpSession 객체에 그 이름으로 이미 값이 보관되어 있다면
//         ServletRequest 보관소에도 복사한다.
@SessionAttributes({"name","age"})
public class Test07 {
    
    // 세션에 저장하고 싶은 값이 있으면,
    // Map/Model 객체에 담는다.
    @RequestMapping(value="/m1", produces="text/plain;charset=UTF-8")
    public String m1(Model model) {
        
        // 프론트 컨트롤러가 준 Model 객체에 값을 저장하면,
        // 이 값은 ServletRequest 저장소에 보관된다.
        // 만약 Model에 저장되는 값의 이름이 
        // 클래스 선언부에 붙인 @SessionAttributes에 설정되어 있다면,
        // 그 값은 HttpSession 객체에 보관된다.
        model.addAttribute("name", "홍길동");
        model.addAttribute("age", 20); // auto-boxing : Integer 객체 저장
        model.addAttribute("working", true); // auto-boxing : Boolean 객체 저장
        
        // Model에 보관된 값이 ServletRequest에 저장되었는지 확인해보자!
        return "v03/test07/m1";
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
    
    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    public String m3(
            @ModelAttribute String name,
            @ModelAttribute int age) {      //이렇게 이름을 생략할 경우 오류가 뜬다.
        
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name=%s\n", name));
        buf.append(String.format("name=%d\n", age));
        
        return buf.toString();
    }
    
    @RequestMapping(value="/m4", produces="text/plain;charset=UTF-8")
    public String m3(
            @ModelAttribute("working") String working) {      //이렇게 이름을 생략할 경우 오류가 뜬다.
        
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("working=%s\n", working));
        
        return buf.toString();
    }
    
    @RequestMapping(value="/m5", produces="text/plain;charset=UTF-8")
    public String m5() {
        return "v03/test07/m1";
    }
}











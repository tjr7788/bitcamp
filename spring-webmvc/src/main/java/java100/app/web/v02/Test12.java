package java100.app.web.v02;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/v02/test12")
public class Test12 {
    
    //요청 핸들러에서 선언 가능한 파라미터
    //HttpServletRequest, HttpServletResponse, HttpSession,
    //HttpMethod, InputStream, Reader, OutputStream, Writer,
    //HttpEntity, Map/Model/ModelMap, Error/BindingResult,
    //SessionStatus, 파라미터, 경로의 일부 추출 값 등
    
    //프론트 컨트롤러는 페이지 컨트롤러의 메소드(요청 핸들러)를 호출하기 전에
    //그 메소드의 파라미터를 분석하여 원하는 값을 넘겨준다.
    //프론트 컨트롤러에게 선언하는것이기에 반드시 프론트 컨트롤러가 줄수있는것이여야한다.
    
    @RequestMapping("m1")
    public String m1(String name, int age, boolean working, float height) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(working);
        System.out.println(height);
        System.out.println("--------------------");
        return "/hello.jsp";
    }
    
    
    @RequestMapping("m2")
    public String m2(java.util.Date birthDate) {
        System.out.println(birthDate);
        System.out.println("--------------------");
        return "/hello.jsp";
    }

    
    @RequestMapping("m3")
    public String m3(@RequestParam(value="name", defaultValue="우헤헤") String name) {
        System.out.println(name);
        return "/hello.jsp";
    }
    @RequestMapping("m4")
    public String m4(String name) {
        System.out.println(name);
        return "/hello.jsp";
    }
}

// @RequestMapping - Content-Type 요청 헤더의 값에 따라 구분하기
//
package java100.app.web.v03;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v03/test02")
public class Test02 {

    @RequestMapping("/m1")
    @ResponseBody       //ResponeBody를 붙이면 url주소가 아니라 바로 클라이언트로 리턴값이 출력된다.
    public String m1() {
        return "/test02/m1";
    }
    
    @RequestMapping("/m2")
    @ResponseBody       //콘텐츠를 출력할 때 기본으로 ISO-8859-1 character set으로 인코딩하기 때문에
                        //한글을 출력하면 바꿀 수 없다는 의미로  ?로 출력된다.
                        // 리턴하기 전에 콘텐츠 타입을 해도 설정되지않는다.
    
    public String m2(HttpServletResponse response) {
        response.setContentType("text/plain:charset=UTF-8");
        
        response.setHeader("Content-Type", "text/plain");
        return "한글";
    }
    
    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m3() {
        return "한글";
    }
    
    @RequestMapping(value="/m4")
    public HttpEntity<String> m4() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        HttpEntity<String> entity = new HttpEntity<>("한글", headers);
        
        return entity;
    }
    
    @RequestMapping(value="/m5")
    public ResponseEntity<String> m5() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        ResponseEntity<String> entity = new ResponseEntity<>("한글", headers, HttpStatus.OK);
        
        return entity;
    }
    
    @RequestMapping(value="/m6")
    @ResponseBody
    public Object m6() {
        return new Member("홍길동", 20, true);
    }
}











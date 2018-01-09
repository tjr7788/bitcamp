// @RequestMapping - Content-Type 요청 헤더의 값에 따라 구분하기
//
package java100.app.web.v03;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     //일반 @Controller가 아닌 @RestController를 붙이게되면 @RequestBody를 생략해도된다.
@RequestMapping("/v03/test04")
public class Test04 {

    @RequestMapping("/m1")
    public Object m1() {
        return new Member("홍길동", 20, true);
    }
    
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    public Object m2() {
        return "안녕";
    }
}











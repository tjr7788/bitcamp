package java100.app.web.v02;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
//@ControllerAdvice? 페이지 컨트롤러를 실행하는 데 추가적인 도움을 제공하는 클래스에 붙인다.


//@ControllerAdvice(assignableTypes= {Test12.class, Test11.class})
public class Test12ControllerAdvice {
    
    //요청이 들어오면 클라이언트가 보낸 데이터를 적절하게 변환하여 페이지 컨트롤러의 메소드를 호출한다.
    //변환기를 셋팅하는데 이것을 "Web Data Binding" 이라 표현한다.
    //문자열을 다른 타입의 값으로 변환시키는 객체를 "WebDataBinder"라 부른다.
    //스프링은 문자열을 primitive 타입으로 바꿀 수 있도록 기본 변환기를 제공한다. 그외의 타입은 개발자가 만들어 셋팅해야 한다.
    //@InitBinder가 붙은 메소드는 프론트 컨트롤러가 문자열을 바꾸기 전에 WebDateBinder를 설정하기 위해 호출하는 메소드이다.
    //그래서 요청이 들어올 때마다 매번 호출된다.
    
    //InitBinder를 이 클래스에 두면 특정 컨트롤러가 아닌 충고하기를 원하는 모든 컨트롤러에 적용할 수 있어 편리하다.
    //즉 문자열을 날짜 타입으로 바꾸기를 원하는 컨트롤러 마다 이 메소도를 추가할 필요가 없다.
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        System.out.println("CotrollerAdvice()");
        //문자열을 날짜 객체로 만들어줄 도구를 준비한다.
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);   //날짜형식을 엄껵하게 검사하라!
        
        
        //스프링에서 제공하는 문자열을 날짜 객체로 변환시켜주는 커스텀 에디터를 준비하여 WebDataBinder에 등록한다.
        binder.registerCustomEditor(Date.class, //문자열을 어떤 타입으로 바꿀지 설정한다.
                new CustomDateEditor(//문자열을 java.util.Date 객체로 만들어준다.
                        dateFormat, // 실제로는 그 작업을 SimpleDateFormat이 한다.
                        false));    // 문자열 값이 비어있는것을 허락할것지 여부
    }   
}

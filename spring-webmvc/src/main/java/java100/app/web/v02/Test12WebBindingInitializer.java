package java100.app.web.v02;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;

public class Test12WebBindingInitializer implements WebBindingInitializer{

    @Override
    public void initBinder(WebDataBinder binder) {
        System.out.println("Test12Web");
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

package bitcamp.java100.ch21.ex6;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// 특정 위치에 삽입될 코드를 갖고 있는 클래스를 정의한다.

@Component
@Aspect
public class MyAdvice {
    
    // 삽입될 코드는 메서드로 정의한다.
    @Before("execution(* bitcamp.java100.ch21.ex6.X.*(..)) and args(name)")
    public void doBefore(String name) {
        System.out.printf("MyAdvice.doBefore() name=%s\n",name);
    }
    
    public void doAfter() {
        System.out.println("MyAdvice.doAfter()");
    }
    
    
    @AfterReturning(value="execution(* bitcamp.java100.ch21.ex6.X.*(..))", returning="returnValue")
    public void doAfterReturning(Object returnValue) {
        System.out.printf("MyAdvice.doAfterRetruning() returnValue=%s\n",returnValue);
    }
    
    @AfterThrowing(value="execution(* bitcamp.java100.ch21.ex6.X.*(..))", throwing="error")
    public void doAfterThrowing(Exception error) {
        System.out.printf("MyAdvice.doAfterThrowing() error=%s\n", error.getMessage());
    }
    
    public void doAround() {
        System.out.println("MyAdvice.doAround()");
    }
}

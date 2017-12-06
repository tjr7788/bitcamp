// Spring IoC(Inversion of Control) 컨테이너 - 셋터 호출 III
// 
package bitcamp.java100.ch20.ex9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext(
                        "bitcamp/java100/ch20/ex9/application-context1.xml");
        Car car = (Car)appCtx.getBean("c1");
        System.out.println(car);
    }
}









// AOP(Aspect-Oriented Programming) - AOP 필터 적용 전
// 
package bitcamp.java100.ch21.ex1_test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext(
                        "bitcamp/java100/ch21/ex1_test/application-context.xml");
        
        String[] names = appCtx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name + ">>>>" + appCtx.getBean(name).getClass().getName());
        }
        
        System.out.println("---------------");
        Front obj = (Front) appCtx.getBean(Front.class);
        obj.test();
    }
}









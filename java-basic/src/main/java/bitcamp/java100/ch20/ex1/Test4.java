package bitcamp.java100.ch20.ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test4 {
    
    @Bean("str1")
    String getString1() {
        return new String();
    }
    @Bean("str2")
    String getString2() {
        return new String("Hello");
    }
    
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext appCtx = 
                new AnnotationConfigApplicationContext(Test4.class);
        System.out.println(appCtx.getBeanDefinitionCount());
        String[] names = appCtx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name + appCtx.getBean(name));
        }
    }
}

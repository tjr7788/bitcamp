package bitcamp.java100.ch21.ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCtx = 
                new AnnotationConfigApplicationContext("bitcamp/java100/ch21/ex1/application-context.xml");
        
        System.out.println("------------------------------------------");
        String[] names = appCtx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.printf("%s => %s\n", name, appCtx.getBean(name));
        }
        Front obj = (Front)appCtx.getBean(Front.class);
        obj.test();
    }

}

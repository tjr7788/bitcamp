package bitcamp.java100.ch20.ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        
        
        ClassPathXmlApplicationContext appCtx =
                new ClassPathXmlApplicationContext(
                        "bitcamp/java100/ch20/ex2/application-context2.xml");
        
        String[] names = appCtx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name + "==>" + appCtx.getBean(name).getClass().getName());
            
            String[] aliases = appCtx.getAliases(name);
            System.out.println("--->별명 : ");
            for(String alias : aliases) {
                System.out.println(alias + "");
            }
        }
   
        
    }
}

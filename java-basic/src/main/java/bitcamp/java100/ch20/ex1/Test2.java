package bitcamp.java100.ch20.ex1;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        
        
        FileSystemXmlApplicationContext appCtx =
                new FileSystemXmlApplicationContext(
                        "./sample/application-context.xml");
        
    }
}

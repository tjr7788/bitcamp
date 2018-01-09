package bitcamp.java100.ch20.ex18_test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("bitcamp.java100.ch20.ex18_test")
public class AppConfig {
    
    // @ComponentScan 애노테이션은 다음의 XML 설정과 같다.
    // => <context:component-scan base-package="bitcamp.java100.ch20.ex18"/>
}













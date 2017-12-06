//: ## ver 45
//: - 컨트롤러와 DAO 객체를 자동 생성하라!
//: - 자동 생성할 클래스 정보를 properties 파일에 등록한 다음,
//:   프로그램을 시작할 때 해당 파일에 등록된 클래스의 객체를 자동생성한다. 
//: - 학습목표
//:   - 객체를 자동 생성하는 방법을 연습한다.
//:   - Reflection API의 활용법을 이해한다.
//: 
//:   
package java100.app;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java100.app.util.DataSource;

@WebServlet(urlPatterns="/init",
        name="AppInitServlet", loadOnStartup=1)
@Configuration
@ComponentScan("java100.app")
public class AppInitServlet implements Servlet{
    
    ServletConfig servletConfig;
    

    public static AnnotationConfigApplicationContext iocContainer;
    
    @Bean("dataSource")
    DataSource getDataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/studydb");
        ds.setUsername("study");
        ds.setPassword("1111");
        return ds;
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("AppIniteServlet.init()");
        
        iocContainer = new AnnotationConfigApplicationContext(AppInitServlet.class);
        this.servletConfig = config;
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("AppIniteServlet.service()");
    }
    
    @Override
    public void destroy() {
        System.out.println("AppIniteServlet.destroy()");
            DataSource ds = iocContainer.getBean(DataSource.class);
            ds.close();
    }
    
    
    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }
    
    @Override
    public String getServletInfo() {
        return "이 서블릿은 다른 서블릿을 위한 스프링 IoC 컨테이너를 준비한다.";
    }
}

















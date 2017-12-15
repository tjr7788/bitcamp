package step6;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listener01 implements ServletContextListener{
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
    }
    
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext webApplicationContext =  sce.getServletContext();
        
        String driver = webApplicationContext.getInitParameter("driver");
        String url = webApplicationContext.getInitParameter("url");
        
        System.out.println("Driver = > " + driver);
        System.out.println("URL = > " + url);
    }
}

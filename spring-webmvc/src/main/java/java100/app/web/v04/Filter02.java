package java100.app.web.v04;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/app/v04/controller02/*")
public class Filter02 implements Filter {
    @Override
    public void destroy() {
        
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Filter02---------------");
        
        chain.doFilter(request, response);
        System.out.println("--------------------Filter02");
    }
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }
}

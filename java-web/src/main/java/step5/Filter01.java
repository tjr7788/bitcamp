package step5;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class Filter01 implements javax.servlet.Filter {
    
    FilterConfig config;
    
    @Override
    public void destroy() {
        System.out.println("Filter01.destroy()");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("step5Filter01.init()");
        this.config = filterConfig;
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/plain;charset=UTF-8");
        chain.doFilter(request, response);
    }
}

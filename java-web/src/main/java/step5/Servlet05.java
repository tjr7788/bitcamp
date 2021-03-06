package step5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/step5/Servlet05")
public class Servlet05 extends HttpServlet {
    
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        PrintWriter out = res.getWriter();
        
        Enumeration<String> names = req.getParameterNames();
        while(names.hasMoreElements()) {
            String name = names.nextElement();
            out.printf("%s: %s\n", name, req.getParameter(name));
            
        }
    }
}


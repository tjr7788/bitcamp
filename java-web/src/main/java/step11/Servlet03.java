package step11;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/step11/other/Servlet03")
public class Servlet03 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        Cookie[] cookies = req.getCookies();   
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                out.printf("%s=%s\n", cookie.getName(), cookie.getValue());
            }
        }
    }
}


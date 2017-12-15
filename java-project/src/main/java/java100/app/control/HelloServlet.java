package java100.app.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/hello/*")
public class HelloServlet extends HttpServlet {
    
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        
        switch (request.getPathInfo()) {
        case "/hi": this.doHi(request, response); break;
        case "/hi2": this.doHi2(request, response); break;
        default:
            this.doError(request, response);
        }   
    }


    private void doError(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>요청 오류!</h1>");
        out.println("<p>요청하신 URL의 서비스를 찾을수 없습니다.</p>");
        out.println("</body>");
        out.println("</html>");
    }


    private void doHi(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hi~~</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    private void doHi2(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hi2~~</h1>");
        out.println("</body>");
        out.println("</html>");
    }


}

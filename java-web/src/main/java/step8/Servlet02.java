package step8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/step8/Servlet02")
public class Servlet02 extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        if (req.getMethod().equals("GET")) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>계산기</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>계산기</h1>");

            out.println("<form action='Servlet02' method='POST'>");
            out.println("<input type='text' name='a' size='3'>");
            out.println("<select name='op'>");
            out.println("<option>+</option>");
            out.println("<option>-</option>");
            out.println("<option>*</option>");
            out.println("<option>/</option>");
            out.println("<option>%</option>");
            out.println("</select>");
            out.println("<input type='text' name='b' size='3'>");
            out.println("<button>=</button>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");

        } else if (req.getMethod().equals("POST")) {
            int a = Integer.parseInt(req.getParameter("a"));
            int b = Integer.parseInt(req.getParameter("b"));
            String op = req.getParameter("op");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>계산기</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>계산 결과</h1>");
            out.println("<p>");
            out.printf("%d %s %d = ", a, op, b);
            
            switch (op) {
            case "+": out.println(a + b); break;
            case "-": out.println(a - b); break;
            case "*": out.println(a * b); break;
            case "/": out.println(a / b); break;
            case "%": out.println(a % b); break;
            default: out.println("지원하지 않는 연산자 입니다!");
            }
            out.println("<p>");
            
            // 이전 입력 양식으로 돌아가는 링크를 추가한다.
            // 사용자가 웹 페이지에서 이 링크를 클릭하면 
            // 웹 브라우저는 Servlet03.html을 웹서버에 요청한다.
            //
            out.println("<a href='Servlet02'>다시 계산</a>");
            
            out.println("</body>");
            out.println("</html>");
        } 
        
    }
   
}


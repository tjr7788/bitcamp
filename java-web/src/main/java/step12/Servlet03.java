package step12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
@WebServlet("/step12/Servlet03")
public class Servlet03 extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/plain;charset=UTF-8");
        HttpSession session = req.getSession();
        String name = req.getParameter("name");
        session.setAttribute("name", name);
        
        RequestDispatcher rd = req.getRequestDispatcher("/step12/form2.jsp");
        rd.forward(req, res);
      
    }
}


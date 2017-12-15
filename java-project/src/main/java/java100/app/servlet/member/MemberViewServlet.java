package java100.app.servlet.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.MemberDao;
import java100.app.domain.Member;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet("/member/view")
public class MemberViewServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("[회원 목록]");
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>회원관리</title>");
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<link rel='stylesheet' href='../css/common.css'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        RequestDispatcher rd = request.getRequestDispatcher("/header");
        rd.include(request, response);
        out.println("<h1>회원 정보</h1>");

        try {

            int no = Integer.parseInt(request.getParameter("no"));

            Member member = memberDao.selectOne(no);
            if (member != null) {
                out.println("<form action='update' method='post'>");
                out.println("<div>");
                out.println("<label for='no'>번호</label>");
                out.printf("<input readonly id='no' type='number' name='no' value='%d'>\n", 
                            member.getNo());
                out.println("</div>");
                out.println("<div>");
                out.println("<label for='email'>이메일</label>");
                out.printf("<input id='email' type='text' name='email' value='%s'>\n", 
                            member.getEmail());
                out.println("</div>");
                out.println("<div>");
                out.println("<label for='name'>이름</label>");
                out.printf("<input id='name' type='text' name='name' value='%s'>\n", 
                            member.getName());
                out.println("</div>");
                out.println("<div>");
                out.println("<label for='pwd'>비밀번호</label>");
                out.printf("<input id='pwd' type='text' name='pwd' value='%s'>\n", 
                            member.getPwd());
                out.println("</div>");
                out.println("<div>");
                out.println("<label for='date'>생성날짜</label>");
                out.printf("<input id='date' type='text' name='date' value='%s'>\n", 
                            member.getCreatedDate());
                out.println("</div>");
                
                out.println("<button>변경</button>");
                out.printf("<a href='delete?no=%d'>삭제<a>\n", member.getNo());
                out.println("</form>");
            } else {
                out.printf("<p>'%s'번의 회원 정보가 없습니다.\n</p>", no);
            }
        } catch (Exception e ) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
        out.println("</tbody>");
        out.println("</table>");
        
        rd = request.getRequestDispatcher("/footer");
        rd.include(request, response);
        
        out.println("</div>");
        
        
        
        
        out.println("<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>");
        out.println("<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>");
        out.println("<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js' ></script>");
        out.println("</body>");
        out.println("</html>");
    }
}

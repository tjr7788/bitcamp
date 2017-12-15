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
@WebServlet("/member/update")
public class MemberUpdateServlet extends HttpServlet {

    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
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
        out.println("<h1>회원 수정</h1>");

        try {
            Member member = new Member();
            member.setEmail(request.getParameter("email"));
            member.setName(request.getParameter("name"));
            member.setPwd(request.getParameter("pwd"));
            member.setNo(Integer.parseInt(request.getParameter("no")));


            // executeUpdate()의 리턴값은 변경된 레코드들의 개수이다.
            // 만약 해당 번호와 일치하는 데이터를 찾지 못해 변경할게 없다면 0을 리턴한다.
            if (memberDao.update(member) > 0 ) { 
                out.println("<p>변경하였습니다.</p>");
            } else {
                out.printf("<p>'%s'의 성적 정보가 없습니다.\n</p>", member.getNo());
            }

        } catch (Exception e ) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
        out.println("<p><a href='list'>목록</a></p>");
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

package java100.app.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.BoardDao;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet("/board/delete")
public class BoardDeleteServlet extends HttpServlet  {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>게시판 관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>게시물 삭제</h1>");
        try {
            int no = Integer.parseInt(request.getParameter("no"));

            if (boardDao.delete(no) > 0) {
                out.println("<p>삭제했습니다.</p>");
            } else {
                out.printf("<p>'%s'의 성적 정보가 없습니다.\n</p>", no);
            }
        } catch (Exception e ) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
        out.println("<p><a href='list'>목록</a></p>");
        out.println("</body>");
        out.println("</html>");
    }


}

package java100.app.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet("/board/*")
public class BoardUpdateServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
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
        out.println("<h1>게시물 변경</h1>");

        try {
            Board board = new Board();
            board.setTitle(request.getParameter("title"));
            board.setContent(request.getParameter("contents"));
            board.setNo(Integer.parseInt(request.getParameter("no")));


            // executeUpdate()의 리턴값은 변경된 레코드들의 개수이다.
            // 만약 해당 번호와 일치하는 데이터를 찾지 못해 변경할게 없다면 0을 리턴한다.
            if (boardDao.update(board) > 0 ) { 
                out.println("<p>변경하였습니다.</p>");
            } else {
                out.printf("<p>'%s'의 성적 정보가 없습니다.</p>\n", board.getNo());
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

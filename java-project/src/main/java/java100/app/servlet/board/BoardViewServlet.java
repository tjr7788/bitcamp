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
@WebServlet("/board/view")
public class BoardViewServlet extends HttpServlet  {


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
        out.println("<h1>게시판 정보</h1>");

        try {

            int no = Integer.parseInt(request.getParameter("no"));

            Board board = boardDao.selectOne(no);
            if (board != null) {
                out.println("<form action='update' method='post'>");
                out.println("<div>");
                out.println("<label for='no'>번호</label>");
                out.printf("<input readonly id='no' type='number' name='no' value='%d'>\n", 
                            board.getNo());
                out.println("</div>");
                out.println("<div>");
                out.println("<label for='title'>제목</label>");
                out.printf("<input id='title' type='text' name='title' value='%s'>\n", 
                            board.getTitle());
                out.println("</div>");
                out.println("<div>");
                out.println("<label for='contents'>내용</label>");
                out.printf("<input id='contents' type='text' name='contents' value='%s'>\n", 
                            board.getContent());
                out.println("</div>");
                out.println("<div>");
                out.println("<label for='date'>날짜</label>");
                out.printf("<input readonly id='date' type='text' name='date' value='%s'>\n", 
                        board.getRegDate());
                out.println("</div>");
                out.println("<div>");
                out.println("<label for='viewcnt'>조회수</label>");
                out.printf("<input id='viewcnt' type='number' name='viewcnt' value='%d'>\n", 
                            board.getViewCount());
                out.println("</div>");
                out.println("<button>변경</button>");
                out.printf("<a href='delete?no=%d'>삭제<a>\n", board.getNo());
                out.println("</form>");
            } else {
                out.printf("'%s'번의 성적 정보가 없습니다.\n", no);
            }

        } catch (Exception e ) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
        out.println("</body>");
        out.println("</html>");
    }
}

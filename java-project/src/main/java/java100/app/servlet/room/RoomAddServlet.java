package java100.app.servlet.room;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet("/room/add")
public class RoomAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>강의실 관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>강의실 추가</h1>");


        out.println("<form method='post'>");
        out.println("<div>");
        out.println("<label for='name'>이름</label>");
        out.println("<input id='name' type='text' name='name'>\n");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for='loc'>지역</label>");
        out.println("<input id='loc' type='text' name='loc'>\n");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for='capacity'>최대인원</label>");
        out.println("<input id='capacity' type='number' name='capacity'>\n");
        out.println("</div>");

        out.println("<button>추가</button>");
        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(RoomDao.class);
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>강의실 관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>강의실 결과</h1>");
        
        try {
            Room room = new Room();
            room.setName(request.getParameter("name"));
            room.setLocation(request.getParameter("loc"));
            room.setCapacity(Integer.parseInt(request.getParameter("capacity")));
            
            roomDao.insert(room);
            out.println("<p>저장하였습니다.</p>");

        } catch (Exception e ) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
        out.println("<p><a href='list'>목록</a></p>");
        out.println("</body>");
        out.println("</html>");
        
    }
}

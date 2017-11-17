//: ## ver 32
//: - 사용자가 입력한 데이터를 파일에 저장하여 다음에 프로그램을 실행할 때도
//:   유지되게 하라!
//: - 학습목표
//:   - File API를 활용하는 방법을 연습한다
//: 
//: 
package java100.app;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import java100.app.control.BoardController;
import java100.app.control.Controller;
import java100.app.control.MemberController;
import java100.app.control.RoomController;
import java100.app.control.ScoreController;

public class App {

    static Scanner keyScan = new Scanner(System.in);

    static HashMap<String, Controller> controllerMap = new HashMap<>();

    void init() {
        controllerMap.put("/score", new ScoreController("./data/score.csv"));
        controllerMap.put("/member", new MemberController("./data/member.csv"));
        controllerMap.put("/board", new BoardController("./data/board.csv"));
        controllerMap.put("/room", new RoomController("./data/room.csv"));
    }

    void service() throws Exception {

        ServerSocket ss = new ServerSocket(9999);
        System.out.println("서버실행");
        
        try (
                Socket socket = ss.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));) {
            
            while (true) {
                String command = in.readLine();
                if (command.equals("/")) {
                    hello(command, out);
                } else {
                    request(command, out);
                }
                out.println();
                out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void request(String command, PrintStream out) {
        
        String menuName = null;
        
        int index = command.indexOf("/", 1);
        if(index != -1) {
            menuName = command.substring(0, index);
        }
        Controller controller = controllerMap.get(menuName);
        
        if (controller == null) {
            out.println("해당 명령을 지원하지 않습니다.");
            return;
        }
        out.println("좋은 명령입니다.");
        // controller.execute();
    }

    private void hello(String commnad, PrintStream out) {
        out.println("안녕하세요. 성적관리 시스템입니다.");
        out.println("[성적]");
        out.println("목록보기 : /score/list");
        out.println("상세보기 : /score/view?name=이름");
        out.println("등록 : /score/add?name=이름&kor=점수&eng=점수&math=점수");
        out.println("변경 : /score/add?name=이름&kor=점수&eng=점수&math=점수");
        out.println("삭제 : /score/add?name=이름&kor=점수&eng=점수&math=점수");
        out.println("[회원]");
        out.println("[게시판]");
        out.println("[강의실]");
    }


    public static void main(String[] args) throws Exception {
        App app = new App();

        app.init();
        app.service();
    }

}

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
import java.util.HashMap;
import java.util.Scanner;

import java100.app.control.BoardController;
import java100.app.control.Controller;
import java100.app.control.MemberController;
import java100.app.control.RoomController;
import java100.app.control.ScoreController;


public class AppTest {

    static Scanner keyScan = new Scanner(System.in);

    static HashMap<String, Controller> controllerMap = new HashMap<>();

    void init() {
        controllerMap.put("/score", new ScoreController("./data/score.csv"));
        controllerMap.put("/member", new MemberController("./data/member.csv"));
        controllerMap.put("/board", new BoardController("./data/board.csv"));
        controllerMap.put("/room", new RoomController("./data/room.csv"));
    }

    void service() throws Exception {
        System.out.println("서버실행");
        ServerSocket ss = new ServerSocket(9999);
        try(
                Socket socket = ss.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
                ) {
            
            while (true) {
                String line = in.readLine();
                if (line.equals("/")) {
                    menu(out);
                } else {
                    request(line, out);
                }
                out.println();
                out.flush();
            } // while
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void request(String line, PrintStream out, BufferedReader in) {
        String command = null;
        int index = line.indexOf("/", 1);
        if (index != -1) {
            command = line.substring(index);
        }
        Controller controller = controllerMap.get("/score");
        if (controller == null) {
            out.println("해당 명령이 없습니다.");
            return;
        }
        controller.execute(out, in);
    }

    private void menu(PrintStream out) {
        out.println("[명령]");
        out.println("menu        - 메뉴 목록 출력한다.");
        out.println("go 번호     - 메뉴로 이동한다.");
        out.println("quit        - 프로그램을 종료한다.");
    }

    public static void main(String[] args) throws Exception {
        AppTest app = new AppTest();

        app.init();
        app.service();
    }

}

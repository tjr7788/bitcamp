package bitcamp.java100.ch15.ex3;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {
    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("서버를 실행하였다.");
        while(true) {
            Socket socket = ss.accept();    //대기열에 대기중에있는 한개의 클라이언트를 가져오는것
            Scanner in = new Scanner(socket.getInputStream()); // 데코레이터
            
            String line = in.nextLine();

            System.out.printf("%s %s:%d 에서 접속함.",
                    line,
                    socket.getInetAddress().getHostAddress(),
                    socket.getPort());
                        
            PrintStream out = new PrintStream(socket.getOutputStream());
            
            out.println(line);
            
            out.close();
            socket.close();
        }
//        ss.close();
        
//        System.out.println("서버를 종료하였다.");
    }
}

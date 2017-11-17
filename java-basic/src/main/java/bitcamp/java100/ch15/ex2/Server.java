package bitcamp.java100.ch15.ex2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        
        ServerSocket ss = new ServerSocket(9999, 3);
        System.out.println("서버를 실행하였다.");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("클라이언트 승인 : ");
            sc.nextLine();
            
            Socket socket = ss.accept();    //대기열에 대기중에있는 한개의 클라이언트를 가져오는것
            System.out.println("클라이언트와 연결되었음!");
            System.out.printf("%s:%d\n",
                    socket.getInetAddress().getHostAddress(), 
                    socket.getPort());
            ss.close();
        }
        
        System.out.println("서버를 종료하였다.");
        
    }
}

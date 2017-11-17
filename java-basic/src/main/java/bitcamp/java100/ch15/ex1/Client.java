package bitcamp.java100.ch15.ex1;

import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        
        Socket socket = new Socket("192.168.0.20", 9999);
        System.out.println("클라이언트 실행");
        System.out.println("서버와 연결되었다.");
        System.out.printf("클라이언트 IP = %s\n",
                socket.getLocalAddress().getHostAddress());
        System.out.printf("클라이언트 Port = %d\n",
                socket.getLocalPort());
        System.out.printf("서버 IP = %s\n",
                socket.getInetAddress().getHostAddress());
        System.out.printf("서버Port = %d\n",
                socket.getPort());
        socket.close();
        System.out.println("서버를 종료하였다.");
    }
}

package bitcamp.java100.ch15.ex3;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("보낼 메세지 : ");
        String message = sc.nextLine();
        
        System.out.print("서버 주소 : ");
        String serverAddr = sc.nextLine();
        
        sc.close();
        
        Socket socket = new Socket(serverAddr, 9999);
        System.out.println("서버와 연결 되었다!");
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println(message);
        
        Scanner in = new Scanner(socket.getInputStream());
        String line = in.nextLine();
        
        System.out.println(line);
        
        
        out.close();
        in.close();
        
        socket.close();
    }
}

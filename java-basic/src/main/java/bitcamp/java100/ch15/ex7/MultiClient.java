package bitcamp.java100.ch15.ex7;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class MultiClient {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("서버 주소 : ");
        String serverAddr = sc.nextLine();
        
        System.out.print("보낼 메세지 : ");
        String message = sc.nextLine();
        sc.close();
        
        DatagramSocket socket = new DatagramSocket();
        System.out.println("데이터보냄");
        
        byte[] bytes = message.getBytes("UTF-8");
        
        InetAddress ip = InetAddress.getByName(serverAddr);
        
        int port = 9999;
        
        DatagramPacket packet = new DatagramPacket(
                bytes , 0, bytes.length, ip, port);
        
        socket.send(packet);
        socket.close();
        
        
        
        
    }
}

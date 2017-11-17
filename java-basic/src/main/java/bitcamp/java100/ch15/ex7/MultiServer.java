package bitcamp.java100.ch15.ex7;

import java.net.DatagramPacket;
import java.net.MulticastSocket;

public class MultiServer {
    public static void main(String[] args) throws Exception {
        
        MulticastSocket socket = new MulticastSocket(9999);
        
        socket.joinGroup(group.;
        
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        while (true) {
            socket.receive(packet);
            
            String message = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
            System.out.printf("보낸이 주소 : %s\n",
                    packet.getAddress());
            System.out.printf("보낸이 포트 : %s\n",
                    packet.getPort());
            System.out.printf("메세지 : %s\n", message);
        }
        
    }
    
}

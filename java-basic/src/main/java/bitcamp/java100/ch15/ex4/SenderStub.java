package bitcamp.java100.ch15.ex4;

import java.net.Socket;
import java.util.Scanner;

public class SenderStub {
    Socket socket;
    Scanner in;
    public SenderStub(Socket socket) throws Exception {
        this.socket = socket;
        
        in = new Scanner(socket.getInputStream());
    }
    public String nextMessage() {
        return in.nextLine();
    }
}

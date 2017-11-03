package bitcamp.java100.ch06.ex2;

import java.io.Console;

public class MessageBox {
    static boolean confirm(String message) {
        Console console = System.console();
        String response = console.readLine(message).toLowerCase();
        return (response.equals("y") || response.equals("yes"));
    }
}

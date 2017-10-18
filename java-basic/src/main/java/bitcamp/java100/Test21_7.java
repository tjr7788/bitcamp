
package bitcamp.java100;

import java.io.Console;

public class Test21_7 {
    public static void main(String[] args) {
        Console console = System.console();

        String num = console.readLine("문자열 : ");
        StringBuffer num2 = new StringBuffer(num);
        System.out.println(num2.reverse());
    }
}

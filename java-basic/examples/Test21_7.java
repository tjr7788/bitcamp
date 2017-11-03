
package bitcamp.java100;

import java.io.Console;

public class Test21_7 {
    static Console console;


    static void prepareConsole() {
        console = System.console();
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
    }

    static String inputString() {
        StringBuffer num2 = new StringBuffer(console.readLine("문자열 : "));
        return num2.toString();
    }
    
    static String reversString(String num) {
        int len = num.length() / 2;
        StringBuffer num2 = new StringBuffer(num);
        
        for (int left = 0, right = num.length()-1; left < len; left++, right-- ) {
            char ch = num.charAt(left);
            num2.setCharAt(left, num.charAt(right));
            num2.setCharAt(right, ch);
            
        }
        return num2.toString();
    }
    
    public static void main(String[] args) {
        
        prepareConsole();
        System.out.println(reversString(inputString()));
        
        
        
    }
}

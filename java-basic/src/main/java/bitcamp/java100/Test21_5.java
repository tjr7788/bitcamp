
package bitcamp.java100;

import java.io.Console;

public class Test21_5 {
    class ConsoleCreationException extends RuntimeException {
    }
    
    class IvalidGugudanException extends RuntimeException {
    }
    static Console console;

    static void prepareInpu() {
        console = System.console();
        if (console == null) {
            throw new RuntimeException("콘솔 생성 오류!");
        }
    }
    public static void main(String[] args) {
        try {
            Console console = System.console();
            int dan;
            while(true) {
                dan = Integer.parseInt(console.readLine("구구단?"));
                if(dan > 9) {
                    System.out.println("9단까지만 가능합니다!");
                    continue;
                }
                else if(dan<1) {
                    System.out.println("다음에 또 뵈요!");
                    break;
                }
                for(int i = 1; i < 10; i++) {
                    System.out.printf("%d * %d = %d\n", dan, i, dan * i);
                }
            }
        }catch (ConsoleCreationException e) {
            System.err.println("콘솔 입력을 지원하지않습니다.");
        }
    }
}




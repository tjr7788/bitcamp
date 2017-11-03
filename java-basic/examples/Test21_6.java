
package bitcamp.java100;

import java.io.Console;

public class Test21_6 {
    static Console console;


    static void prepareConsole() {
        console = System.console();
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
    }

    static long input() {
        return Long.parseLong(console.readLine("숫자를 입력해주세요 : "));
    }

    static int[] abc(long num) {
        int[] arr = new int[10];
        
        while(num > 0) {
            arr[(int)(num % 10)]++;
            num /= 10;

        }
        return arr;
    }
    static void print(int[] arr) {
        int cnt = 0;
        for(int i : arr) {
            System.out.printf("%d의 갯수는 %d\n",cnt,i);
            cnt++;
        }
    }


    public static void main(String[] args) {

        prepareConsole();
        print(abc(input()));

    }
}




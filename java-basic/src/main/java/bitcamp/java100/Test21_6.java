
package bitcamp.java100;

import java.io.Console;

public class Test21_6 {
    public static void main(String[] args) {
        Console console = System.console();
        int[] arr = new int[10];
        
        int num;
        int cnt = 0;
        
        num = Integer.parseInt(console.readLine("숫자를 입력해주세요 : "));
        while(num > 0) {
            int i = num % 10;
            arr[i]++;
            num /= 10;
        }
        for(int i : arr) {
            System.out.printf("%d의 갯수는 %d\n",cnt,i);
            cnt++;
        }
    }
}
    



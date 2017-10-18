
package bitcamp.java100;

import java.util.Scanner;

public class Test21_1 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("입력하세요 : ");
        String line = keyScan.nextLine(); // 입력값을 한줄씩 잘라서 리턴한다.
        System.out.println(line);
        keyScan.close();
    }
}
    



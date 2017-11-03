
package bitcamp.java100;

import java.io.Console;

public class Test21_3 {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // 에러가뜨면 JVM을 종료, 정상적이면 System.exit(0);
        }
        
        String name;
        int age;
        boolean working;
        float gpa;
        
        name = console.readLine("이름 입력 : ");
        age = Integer.parseInt(console.readLine("나이 입력 : "));
        working = Boolean.parseBoolean(console.readLine("재직 여부(true or false :"));
        gpa = Float.parseFloat(console.readLine("졸업 학점 : "));
        
        
        
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %s\n", age);
        System.out.printf("재직여부 : %s\n", working);
        System.out.printf("졸업학점 : %s\n", gpa);
        
        
        
        
    }
}
    



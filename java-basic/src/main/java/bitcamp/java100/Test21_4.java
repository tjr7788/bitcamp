
package bitcamp.java100;

import java.io.Console;

public class Test21_4 {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // 에러가뜨면 JVM을 종료, 정상적이면 System.exit(0);
        }
        class Student {
            String name;
            int age;
            boolean working;
            float gpa;
        }
        
        Student std = new Student();
               
        std.name = console.readLine("이름 입력 : ");
        std.age = Integer.parseInt(console.readLine("나이 입력 : "));
        std.working = Boolean.parseBoolean(console.readLine("재직 여부(true or false) : "));
        std.gpa = Float.parseFloat(console.readLine("졸업 학점 : "));
        
        
        
        System.out.printf("이름 : %s\n", std.name);
        System.out.printf("나이 : %s\n", std.age);
        System.out.printf("재직여부 : %s\n", std.working);
        System.out.printf("졸업학점 : %s\n", std.gpa);
        
        
        
        
    }
}
    



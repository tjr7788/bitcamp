package bitcamp.java100.ch06.ex3;

public class MyClass3 {
    static int v1 = 100;
    
    static void m1() {
        System.out.println("MyClass2.m1()");
    }
    static {
        System.out.println("MyClass3의 static 블록 실행");
        v1 = 300;
    }
}
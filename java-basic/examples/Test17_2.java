
package bitcamp.java100;

public class Test17_2 {
    static void m1(String name) {
        System.out.printf("%s님 반가워요\n", name);
    }
    
    static void m2(String name, int age) {
        System.out.printf("%s님 반가워요.", name);
        System.out.printf("나이는 %d살이군요.\n", age);
    }
    public static void main(String[] args) {
        m1("오세현");
        m2("오세현", 20);
    }
}

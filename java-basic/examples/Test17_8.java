
package bitcamp.java100;

public class Test17_8 {
    static class Member {
        String name;
        int age;
        boolean working;
        float score;
        char level;
    }
    static Member m1() {
        Member ref = new Member();
        ref.name = "홍길동";
        ref.age = 10;
        ref.working = false;
        ref.score = 4.14f;
        ref.level = 'M';
        return ref;
    }
    public static void main(String[] arg) {
        Member m1 = m1();
        System.out.println(m1.name);
    }
    
}

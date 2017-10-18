
package bitcamp.java100;

public class Test17_13 {
    static void m1(int value) {
        value += 50;
        m2(value); 
        System.out.println(value);
    }
    static void m2(int value) {
        value += 40;
        m3(value);
        System.out.println(value);
    }
    static void m3(int value) {
        value += 30;
        System.out.println(value);
    }
    public static void main(String[] args) {
        int value = 100;
        m1(value);
    }
}

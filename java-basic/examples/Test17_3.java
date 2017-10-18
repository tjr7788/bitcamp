
package bitcamp.java100;

public class Test17_3 {
    static void m1(int... values) {
        System.out.println(values.length);
        for (int v : values) {
            System.out.println(v);
        }
    }
    static void sum(int... values) {
        int s = 0;
        for (int v : values) {
            s+=v;
        }
        System.out.println("합계" + s);
    }
    public static void main(String[] args) {
        m1(1,2,3,4,2,3,4,1,2,3,1);
        
        sum(3,2,3,1,2,4,1,2,1);
    }
}

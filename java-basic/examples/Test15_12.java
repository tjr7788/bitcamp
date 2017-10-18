
package bitcamp.java100;

public class Test15_12{

    public static void main(String[] args) {
        int v = 87;
        
        System.out.println(Integer.toBinaryString(v));
        System.out.println(v);
        System.out.println(Integer.toBinaryString(v << 1));
        System.out.println(v<<1);
        System.out.println(Integer.toBinaryString(v << 2));
        System.out.println(v<<2);
        System.out.println(Integer.toBinaryString(v << 3));
        System.out.println(v<<3);
        
        
        v = -87;
        
        System.out.println(Integer.toBinaryString(v));
        System.out.println(v);
        System.out.println(Integer.toBinaryString(v << 1));
        System.out.println(v<<1);
        System.out.println(Integer.toBinaryString(v << 2));
        System.out.println(v<<2);
        System.out.println(Integer.toBinaryString(v << 3));
        System.out.println(v<<3);
        
        for(int i = 0; i < 40 ; i++) {
            System.out.println();
        }
    }
}

package bitcamp.java100;

public class Test15_10{

    public static void main(String[] args) {
        
        int v1 = 0b0101_1100;   
        int v2 = 0b0110_0110;
        
        
        
        int result = ~ v2;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(result);
        System.out.println(Integer.toBinaryString(v2)); 
        System.out.println(Integer.toBinaryString(result));
        
    }
}

package bitcamp.java100;

public class Test17_14 {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("swap(): a = %d, b= %d\n", a, b);
    }
    
    static void swap2(int[] r) {
        int temp = r[0];
        r[0] = r[1];
        r[1] = temp;
        
        System.out.printf("swap2(): r[0] = %d, r[1] = %d\n",r[0], r[1]);
    }
    
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        
        swap(a, b);
        
        System.out.printf("main(): a = %d, b= %d\n", a, b);     // 값을 넘기므로 main 그대로다.
        
        int[] arr = new int[2];
        arr[0] = 5;
        arr[1] = 7;
        
        swap2(arr);
        System.out.printf("main(): a = %d, b= %d\n", arr[0], arr[1]);     // 배열은 주소 값을 넘기므로 main도 같이 바뀜
    }
}


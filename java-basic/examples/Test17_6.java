
package bitcamp.java100;

public class Test17_6 {
    static int[] m1() {
        int[] values = {100, 90, 80};   //선언과 동시에 하면 new가 필요없다.
        
        
        int[] values2;
//        values2 = {100,90,80};  //선언후 new를 안붙이고 하면 오류
        values2  = new int[] {100, 90, 80};    //new를 붙여야 된다.
        
//        return {100, 90, 80};    //오류가뜸
        return new int[] {100, 90, 80}; //new int[]를 사용해야 된다.
    }
    public static void main(String[] args) {
        int[] arr = m1();
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test3 {
    public static void main(String[] args) {
        
        HashSet<String> list = new HashSet<>();
        
        String s1 = "홍길동";
        String s2 = "홍길동1";
        String s3 = "홍길동2";
        String s4 = "홍길동";
        
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        list.add(s1);   //같은 값은 중복 안된다.
        
        list.add(null); //null값 가능
        
        System.out.println(list.size());
        
        String[] arr = new String[list.size()];
        String[] arr2 = list.toArray(arr);
        
        if (arr == arr2) {
            System.out.println("같다");
        }
        else {
            System.out.println("arr != arr2");
        }
        
        for(String s : arr) {  //저장순서대로 꺼내기 가능
            System.out.println(s);
        }
    }
}

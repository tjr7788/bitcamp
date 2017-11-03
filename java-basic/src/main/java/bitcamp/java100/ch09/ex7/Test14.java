package bitcamp.java100.ch09.ex7;

import java.util.HashSet;
import java.util.Iterator;

public class Test14 {
    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();
        
        set.add("홍길동");
        set.add("홍길동1");
        set.add("홍길동2");
        
        Iterator<String> iterator = set.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        
//        list.add(s1);   //같은 값은 중복 안된다.
//        
//        list.add(null); //null값 가능
//        
//        System.out.println(list.size());
//        
//        String[] arr = new String[list.size()];
//        String[] arr2 = list.toArray(arr);
//        
//        if (arr == arr2) {
//            System.out.println("같다");
//        }
//        else {
//            System.out.println("arr != arr2");
//        }
//        
//        for(String s : arr) {  //저장순서대로 꺼내기 가능
//            System.out.println(s);
//        }
    }
}


package bitcamp.java100.ch09.ex7;

import java.util.ArrayList;
import java.util.Iterator;

public class Test13 {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        
        String s1 = "홍길동";
        String s2 = "홍길동1";
        String s3 = "홍길동2";
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        list.add(s1);   //중복 가능
        
        list.add(null); //null값 가능
        
        System.out.println(list.size());
        
        Iterator<String> iterator = list.iterator();
        
        while(iterator.hasNext()) {
            System.out.printf("%s\n", iterator.next());
        }
    }
}

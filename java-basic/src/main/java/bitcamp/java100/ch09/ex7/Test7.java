package bitcamp.java100.ch09.ex7;

import java.util.HashMap;

public class Test7 {

    static class Contact {
        String name;
        String email;

        public Contact(String name, String email) {
            this.name = name;
            this.email = email;
        }
        public String toString() {
            return "Contact [name =" + name + ", email =" + email +"]";
        }
    }

    public static void main(String[] args) {

        HashMap<String, Contact> map = new HashMap<>();

        Contact c1 = new Contact("홍길동","홍길동@naver.com");
        Contact c2 = new Contact("홍길동","홍길동@naver.com");
        Contact c3 = new Contact("홍길동","홍길동@naver.com");
        map.put("aaa", c1);
        map.put("bbb", c2);
        map.put("ccc", c3);

        System.out.println(map.get("aaa"));
        System.out.println(map.get("aaa").toString());
        System.out.println(map.get("bbb"));
        System.out.println(map.get("ccc"));
        
        
        String key = new String("aaa");
        System.out.println("aaa" == key);
        System.out.println("aaa".hashCode());
        System.out.println(key.hashCode());
        System.out.println("aaa".equals(key));
        
        System.out.println(map.get(key));
    }

    // map.add(s1);
    // map.add(s2);
    // map.add(s3);
    //
    // map.add(s1); //같은 값은 중복 안된다.
    //
    // map.add(null); //null값 가능
    //
    // System.out.println(map.size());
    //
    // String[] arr = new String[map.size()];
    // String[] arr2 = map.toArray(arr);
    //
    // if (arr == arr2) {
    // System.out.println("같다");
    // }
    // else {
    // System.out.println("arr != arr2");
    // }
    //
    // for(String s : arr) { //저장순서대로 꺼내기 가능
    // System.out.println(s);
    // }
}

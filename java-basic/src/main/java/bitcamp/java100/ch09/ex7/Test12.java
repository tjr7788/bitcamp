package bitcamp.java100.ch09.ex7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import bitcamp.java100.ch09.ex7.Test7.Contact;

public class Test12 {

    public static void main(String[] args) {
        HashMap<String, Contact> map = new HashMap<>();
        
        Contact c1 = new Contact("홍길동", "홍@naver.com");
        
        map.put("c01", c1);
        map.put("c02", c1);
        map.put("c03", c1);
        
        Set<Entry<String, Contact>> entrySet = map.entrySet();
        
        for (Entry<String, Contact> entry : entrySet) {
            String key = entry.getKey();
            Contact value = entry.getValue();
            
            System.out.printf("%s = %s, %s\n", key, value.name, value.email);
        }
        
        System.out.println("-----------------------");
        System.out.println(map.get("c01"));
        System.out.println(map.get("c02"));
        System.out.println(map.get("c03"));
    }
}

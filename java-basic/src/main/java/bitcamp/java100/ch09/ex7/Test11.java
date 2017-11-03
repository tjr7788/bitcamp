package bitcamp.java100.ch09.ex7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import bitcamp.java100.ch09.ex7.Test7.Contact;

public class Test11 {

    public static void main(String[] args) {
        HashMap<String, Contact> map = new HashMap<>();
        
        Contact c1 = new Contact("홍길동", "홍@naver.com");
        
        map.put("c01", c1);
        map.put("c02", c1);
        map.put("c03", c1);
        
        Collection<Contact> values = map.values();
        
        
        for(Contact c : values) {
            System.out.println(c.toString());
        }
        System.out.println("-----------------------");
        System.out.println(map.get("c01"));
        System.out.println(map.get("c02"));
        System.out.println(map.get("c03"));
    }
}

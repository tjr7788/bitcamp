package bitcamp.java100.ch07.ex4;

import bitcamp.java100.test17_17.step1.Test;

public class Test1 {
    public static void main(String[] args) {
        Test1 obj = new Test1();
        
        
        if (obj instanceof Test1) {
            System.out.println("obj 인스턴스");
        }
        
        if (obj instanceof Object) {
            System.out.println("obj 인스턴스");
        }
        
        Class c = Test.class;
        Class sc = c.getSuperclass();
        System.out.println(sc.getName());
        System.out.println(sc);
        
        Class sc2 = sc.getSuperclass();
    }
}

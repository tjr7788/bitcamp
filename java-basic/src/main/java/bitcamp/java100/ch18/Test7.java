package bitcamp.java100.ch18;

import java.lang.reflect.Constructor;

public class Test7 {
    public static void main(String[] args) throws Exception {
        
        Class<?> clazz = Z.class;
        
        obj = (X)clazz.newInstance();
        
        Constructor<?> constructor = clazz.getConstructor(int.class);
        
        X obj = (X)constructor.newInstance(10);
        
        System.out.println(obj);
        
        constructor = clazz.getConstructor(String.class, int.class);
        obj = (X)constructor.newInstance("홍길동", 20);
        System.out.println(obj);
    }
}

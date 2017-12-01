package bitcamp.java100.ch18;

import java.lang.reflect.Field;

public class Test6 {
    public static void main(String[] args) throws Exception {
        
        Class<?> clazz = Z.class;
        Field[] fileds = clazz.getFields();
        
        for (Field f : fileds) {
            System.out.printf("%s, %s\n",f.getType().getName(), f.getName());
        }
        System.out.println("================");
        fileds = clazz.getDeclaredFields();
        
        for (Field f : fileds) {
            System.out.printf("%s, %s\n",f.getType().getName(), f.getName());
        }
    }
}

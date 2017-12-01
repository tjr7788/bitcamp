package bitcamp.java100.ch18;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test5 {
    public static void main(String[] args) throws Exception {
        
        Class<?> clazz = Z.class;
        
        Method m = clazz.getDeclaredMethod("m3", int.class, float.class);
        System.out.println(m.getName());
        System.out.println(m.getReturnType());
        
        int modifiers = m.getModifiers();
        
        System.out.println(Modifier.toString(modifiers));
    }
}

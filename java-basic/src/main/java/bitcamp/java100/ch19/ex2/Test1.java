package bitcamp.java100.ch19.ex2;

import java.lang.annotation.Annotation;

public class Test1 {
    public static void main(String[] args) {
        Class<?> clazz = MyClass.class;
        
        Annotation[] annos = clazz.getAnnotations();
        
        for(Annotation anno : annos) {
            System.out.println(anno.annotationType().getName());
        }
    }
}

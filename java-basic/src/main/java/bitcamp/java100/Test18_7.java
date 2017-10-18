package bitcamp.java100;

public class Test18_7 {
    public static void main(String[] args) {
        String s1 = "hello!";   //Immutable 객체
        
        String s2 = s1.replace("l", "x");
        
        
        System.out.println(s1);
        System.out.println(s2);
        
        StringBuffer sb1 = new StringBuffer("Hello!");
        
        sb1.append("World!");
        
        System.out.println(sb1);
        
        sb1.replace(2, 4, "xx");
        
        System.out.println(sb1);
    }
}




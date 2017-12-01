package bitcamp.java100.ch19.ex1;

@MyAnootation
public class MyClass {
    
    @MyAnootation
    public int a;
    
    @MyAnootation
    public void m() {
        
        System.out.println("Hello!");
    }
    
    public void m2(@MyAnootation int a, @MyAnootation String b) {
        @MyAnootation
        int x = 10;
    }
    
    
}

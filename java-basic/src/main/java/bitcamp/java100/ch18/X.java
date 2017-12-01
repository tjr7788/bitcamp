package bitcamp.java100.ch18;

public class X {
    String name;
    int age;
    @Override
    public String toString() {
        return this.name +", " + this.age;
    }
    
    public X() {
        System.out.println("X() 호출됨");
    }
    
    public X(int p1) {
        System.out.println("X(int) 호출됨");
        this.age = p1;
    }
    
    public X(String p1) {
        System.out.println("X(String) 호출됨");
        this.name = p1;
    }
    
    public X(String p1, int p2) {
        System.out.println("X(Stirng, int) 호출됨");
        this.name = p1;
        this.age = p2;
    }
    
    public void m()  {
        System.out.println("m() 호출됨");
    }
    
    public void m(int p1)  {
        System.out.println("m(int) 호출됨");
    }
    
    public void m(int p1, String p2)  {
        System.out.println("m(int, String) 호출됨");
    }
    
    public static void m2() {
        System.out.println("X.m2()호출됨");
    }
    
    public static void m2(int p1) {
        System.out.println("X.m2(int)호출됨");
    }
}

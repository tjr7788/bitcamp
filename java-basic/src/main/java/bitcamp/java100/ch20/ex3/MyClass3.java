package bitcamp.java100.ch20.ex3;

public class MyClass3 {
    public MyClass3() {
        System.out.println("MyClass3");
    }
    public MyClass3(float left, float right) {
        System.out.println("MyClass3(float, float)");
    }
    public MyClass3(MyClass myClass) {
        System.out.println("MyClass3(MyClass)");
    }
    public MyClass3(String name, int age) {
        System.out.println("MyClass(String, int)");
    }
    
    public MyClass3(int age, String name) {
        System.out.println("MyClass(int, String)");
    }
    
    public MyClass3(String name, int age, boolean bool) {
        System.out.println("MyClass(String, int, boolean)");
    }
}


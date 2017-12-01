package bitcamp.java100.ch20.ex3;

public class MyClass {
    public MyClass() {
        System.out.println("MyClass");
    }
    public MyClass(int age) {
        System.out.println("MyClass(int)");
    }
    public MyClass(String name) {
        System.out.println("MyClass(String)");
    }
    public MyClass(String name, int age) {
        System.out.println("MyClass(String, int)");
    }
    
    public MyClass(int age, String name) {
        System.out.println("MyClass(int, String)");
    }
    
    public MyClass(String name, int age, boolean bool) {
        System.out.println("MyClass(String, int, boolean)");
    }
}


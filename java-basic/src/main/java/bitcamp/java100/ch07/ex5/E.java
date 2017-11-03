package bitcamp.java100.ch07.ex5;

public class E extends A{
    int age;
    String name;
    E() {
        E(){
            this("홍길동",상속);
        }
    }
    
    E(String name) {
        this(name,20);
    }
    E(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

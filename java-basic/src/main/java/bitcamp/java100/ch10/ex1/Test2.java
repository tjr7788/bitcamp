package bitcamp.java100.ch10.ex1;


public class Test2 {
    static class A{

    }   //top level nested class

    class B{

    }   //
    public static void main(String[] args) {


        Object obj = new Object() {
            String name;
            {
                name = "홍길동";
            }
        };
    }
}

package bitcamp.java100.ch09.ex4;

public class Test1 {
    
    static void printList(Stack list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.printf("%s \n", list.pop());
        }
    }
    public static void main(String[] args) {
        Stack list = new Stack();
        
        
        list.push("홍길동");
        list.push("홍길동1");
        list.push("홍길동2");
        list.push("홍길동3");
        System.out.printf("%s \n", list.pop());
        System.out.printf("%s \n", list.pop());
        System.out.printf("%s \n", list.pop());
        System.out.printf("%s \n", list.pop());
    }
}
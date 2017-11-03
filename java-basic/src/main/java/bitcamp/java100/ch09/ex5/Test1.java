package bitcamp.java100.ch09.ex5;

public class Test1 {
    
    static void printList(Queue list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.printf("%s \n", list.poll());
        }
    }
    public static void main(String[] args) {
        Queue list = new Queue();
        
        
        list.add("홍길동");
        list.add("홍길동1");
        list.add("홍길동2");
        list.add("홍길동3");
        System.out.printf("%s \n", list.poll());
        System.out.printf("%s \n", list.poll());
    }
}
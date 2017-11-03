package bitcamp.java100.ch09.ex3;

public class Test1 {
    
    static void printList(LinkedList list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.printf("%s \n", list.get(i));
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.add("홍길동");
        list.add("임꺽정");
        list.add("임꺽정1");
        list.add("임꺽정2");
        list.add("임꺽정3");
        list.add("임꺽정4");
        System.out.println(list.get(6));
        
//        
//        printList(list);
//        list.insert(3, "간디");
//        System.out.println();
//        System.out.println("---------------");
//        printList(list);
    }
}
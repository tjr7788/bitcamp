package exaple;

public class Test1 {
    
    static void print(LinkedList list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------------------");
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("홍길동");
        list.add("홍길동1");
        list.add("홍길동2");
        
        print(list);
        System.out.println(list.size());
        list.insert(1, "간디");
        System.out.println(list.size());
        
        print(list);
        
        list.remove(4);
        
        
        System.out.println(list.size());
        print(list);
        
    }
}
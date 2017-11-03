package bitcamp.java100.ch09.ex1;

public class Test2 {
    public static void main(String[] args) {
        
        Array list = new Array();
        
        list.add(new String("홍길동"));
        list.add(new Integer(10));
        list.add(80); //Auto Boxing
        list.add(70);
        list.add(250);
        list.add(250 / 3f);
        list.add("임꺽정");
        
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.insert(6, "유관순");
        
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
       
    }
}

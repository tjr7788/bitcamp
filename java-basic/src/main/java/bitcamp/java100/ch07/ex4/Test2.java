package bitcamp.java100.ch07.ex4;

public class Test2 {
    public static void main(String[] args) {
        Test2 obj = new Test2();
        
        Test2 obj2 = new Test2();
        Test2 obj3 = obj;
        
        System.out.println(obj.toString());
        System.out.println(Integer.toHexString(obj3.hashCode()));
        
        System.out.println(obj.equals(obj));
        System.out.println(obj.equals(obj2));
        System.out.println(obj.equals(obj3));
        if (obj instanceof Test2) {
            System.out.println("obj 인스턴스");
        }
        
        if (obj instanceof Object) {
            System.out.println("obj 인스턴스");
        }
        
        Class c = Test1.class;
        Class sc = c.getSuperclass();
        System.out.println(sc.getName());
        System.out.println(sc);
        
        Class c3 =obj.getClass();
        System.out.println(c3.getName());
    }
}

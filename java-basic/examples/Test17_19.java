
package bitcamp.java100;



public class Test17_19 {
    
    static class My {
        int value;
        
        void print() {
            System.out.println(this.value);
        }
    }
    public static void main(String[] args) {
        My r1 = new My();
        My r2 = new My();
        My r3 = new My();
        
        
        r1.value = 100;
        r2.value = 200;
        r3.value = 300;
        
        r1.print();
        r2.print();
        r3.print();
        
//        My r4 = null;
//        r4.print();
//        
//        String s1 = "hello";
//        s1.print();
        
        
        
    }
}



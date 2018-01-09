// AOP(Aspect-Oriented Programming) - AOP 필터 적용 후
// 
package bitcamp.java100.ch21.ex5;

import bitcamp.java100.ch21.ex5.Front;

public class Test1 {

    public static void main(String[] args) {
        XProxy xproxy = new XProxy();
        Front obj = new Front();
        obj.x = xproxy;
        System.out.println("------------------------------------------");
        obj.test(null);
    }
}







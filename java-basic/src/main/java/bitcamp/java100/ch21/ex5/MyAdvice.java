package bitcamp.java100.ch21.ex5;

// 특정 위치에 삽입될 코드를 갖고 있는 클래스를 정의한다.
//
public class MyAdvice {
    
    // 삽입될 코드는 메서드로 정의한다.
    public void doBefore(String name) {
        System.out.printf("MyAdvice.doBefore() name=%s\n",name);
    }
    
    public void doAfter() {
        System.out.println("MyAdvice.doAfter()");
    }
    
    public void doAfterReturning(Object returnValue) {
        System.out.printf("MyAdvice.doAfterRetruning() returnValue=%s\n",returnValue);
    }
    
    public void doAfterThrowing(Exception error) {
        System.out.printf("MyAdvice.doAfterThrowing() error=%s\n", error.getMessage());
    }
    
    public void doAround() {
        System.out.println("MyAdvice.doAround()");
    }
}

package bitcamp.java100.ch21.ex7;

public class XProxy extends X{
    @Override
    public String m1(String name) {
        MyAdvice advice = new MyAdvice();
        
        advice.doBefore(name);
        String returnValue = super.m1(name);
        advice.doAfterReturning(returnValue);
        advice.doAfter();
        
        return super.m1(name);
    }
}

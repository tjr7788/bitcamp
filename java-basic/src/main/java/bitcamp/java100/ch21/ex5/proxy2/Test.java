package bitcamp.java100.ch21.ex5.proxy2;

public class Test {
    public static void main(String[] args) {
        Calculator worker = new CalculatorProxy();
        System.out.println(worker.plus(10, 20));
        System.out.println(worker.minus(20, 10));
    } 
}

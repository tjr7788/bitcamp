package bitcamp.java100.ch07.ex3.before;

public class Test1 {
    public static void main(String[] args) {
        CalculatorA calc = new CalculatorA();
        calc.plus(10);
        calc.plus(20);
        calc.multiple(2);
        calc.multiple(3);
        calc.divide(10);
        
        System.out.println(calc.result);
    }
}

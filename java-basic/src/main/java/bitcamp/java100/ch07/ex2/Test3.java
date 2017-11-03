package bitcamp.java100.ch07.ex2;

public class Test3 {
    public static void main(String[] args) {
        CalculatorB calc = new CalculatorB();
        
        calc.plus(10);
        calc.plus(20);
        calc.multiple(2);
        calc.multiple(3);
        calc.divide(10);
        
        System.out.println(calc.result);
    }
}

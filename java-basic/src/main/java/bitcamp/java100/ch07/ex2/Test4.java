package bitcamp.java100.ch07.ex2;

public class Test4{
    public static void main(String[] args) {
        CalculatorA calc = new CalculatorA();
        calc.result = 1;
        calc.multiple(5);
        calc.divide(0);
        
        System.out.println(calc.result);
    }
}

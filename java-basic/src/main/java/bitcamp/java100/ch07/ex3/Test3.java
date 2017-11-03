package bitcamp.java100.ch07.ex3;

public class Test3{
    public static void main(String[] args) {
        CalculatorB calc = new CalculatorB();
        calc.result = 1;
        calc.multiple(10);
        calc.multiple(17);
        calc.divide(3);
        calc.reminder(5);
        
        System.out.println(calc.result);
    }
}

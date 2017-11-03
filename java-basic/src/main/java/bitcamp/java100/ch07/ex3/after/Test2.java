package bitcamp.java100.ch07.ex3.after;

public class Test2 {
    public static void main(String[] args) {
        CalculatorB calc = new CalculatorB();
        
        calc.result = 1;
        calc.multiple(2);
        calc.multiple(3);
        calc.divide(3);
        calc.reminder(5);
        
        System.out.println(calc.result);
    }
}

package bitcamp.java100.ch07.ex3.before;

public class Test2 {
    public static void main(String[] args) {
        CalculatorB calc = new CalculatorB();
        
        calc.value = 1;
        calc.multiple(2);
        calc.multiple(3);
        calc.divide(3);
        calc.reminder(5);
        
        System.out.println(calc.value);
    }
}

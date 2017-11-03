package bitcamp.java100.ch07.ex3;

public class CalculatorB {
    int result;
    
    void multiple(int value) {
        this.result *= value;
    }
    
    void divide(int value) {
        this.result /= value;
    }
    
    void reminder(int value) {
        this.result %= value;
    }
    
}

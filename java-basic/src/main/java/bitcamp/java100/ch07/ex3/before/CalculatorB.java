package bitcamp.java100.ch07.ex3.before;

public class CalculatorB {
    int value;
    
    void multiple(int value) {
        this.value *= value;
    }
    
    void divide(int value) {
        this.value /= value;
    }
    
    void reminder(int value) {
        this.value %= value;
    }
    
}

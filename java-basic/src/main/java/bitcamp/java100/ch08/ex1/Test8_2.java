package bitcamp.java100.ch08.ex1;

class Score2 {
    String name;
    int eng;
    int kor;
    int math;
    private int sum;
    private float aver;
    
    public void compute(){
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
    
    public int getSum() {
        return this.sum;
    }
    public float getAver() {
        return this.aver;
    }
}

public class Test8_2 {
    
    public static void main(String[] args) {
        Score2 s = new Score2();
        s.name = "홍길동";
        s.kor = 20;
        s.eng = 100;
        s.math = 80;
        s.compute();
        s.getSum();
        s.getAver();
        
    }
}

package bitcamp.java100.ch06.ex1;

public class Score8 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    Score8() {
        this.name = "홍길동";
        compute();
    }
    
    Score8(String name) {
        this(name, 50, 50, 50);
    }
    
    
    Score8(String name, int kor, int eng, int math) {
        this.name = name;
        this.eng = kor;
        this.kor = eng;
        this.math = math;
    }
    
    void compute() {
        this.sum = this.kor + this. eng + this.math;
        this.aver = this.sum / 3f;
    }
}

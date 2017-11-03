package bitcamp.java100.ch08.ex1;

class Score {
    String name;
    int eng;
    int kor;
    int math;
    int sum;
    float aver;
}

public class Test8_1 {
    
    public static void main(String[] args) {
        Score s = new Score();
        s.name = "홍길동";
        s.kor = 20;
        s.eng = 100;
        s.math = 80;
        s.sum = s.kor + s.eng + s.math;
        s.aver = s.sum / 3f;
        
        
    }
}

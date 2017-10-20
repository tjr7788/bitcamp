package bitcamp.java100.ch06.ex1;

public class Score10 {
    String name = "이름없음";
    int kor = 10;
    int eng = 10;
    int math;
    int sum;
    float aver;
    {
        this.name = "홍길동";
    }
    
    Score10() {
        this.name = "임꺽정";
        this.kor = 20;
        this.eng = 20;
        this.math = 20;
    }
    
    Score10(String name) {
        System.out.println("Score9(String) 호출됨!");
    }
    
    Score10(String name, int kor, int eng, int math) {
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

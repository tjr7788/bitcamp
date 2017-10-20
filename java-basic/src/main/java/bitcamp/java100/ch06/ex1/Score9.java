package bitcamp.java100.ch06.ex1;

public class Score9 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    {
        System.out.println("인스턴스 초기화 블록 실행!");
        System.out.println("인스턴스 초기화 블록 실행!111");
        System.out.println("인스턴스 초기화 블록 실행!222");
    }
    
    Score9() {
        System.out.println("Score9() 호출됨!");
    }
    
    Score9(String name) {
        System.out.println("Score9(String) 호출됨!");
    }
    
    Score9(String name, int kor, int eng, int math) {
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

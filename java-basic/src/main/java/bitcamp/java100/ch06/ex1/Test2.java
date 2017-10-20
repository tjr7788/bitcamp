package bitcamp.java100.ch06.ex1;

public class Test2 {
    public static void main(String[] args) {
        
        Score sco = new Score();
        sco.name = "홍길동";
        sco.kor = 100;
        sco.eng = 90;
        sco.math = 80;
        
        
        sco.sum = sco.kor + sco.eng + sco.math;
        sco.aver = sco.sum / 3f;
    }
}

package bitcamp.java100;

public class Test14_5{
    public static void main(String[] args){    
        class Score{
            String name;
            int kor, eng, math, sum;
            float avg;

            void compute(){
                sum = kor + eng + math;
                avg = sum / 3.0f;
            }
        }
            Score s1 = new Score();
            s1.name = "홍길동";
            s1.kor = 100;
            s1.eng = 100;
            s1.math = 100;
            s1.compute();
    
            System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.avg);

    }
}


package bitcamp.java100;

public class Test17_1 {
    
    static class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;
    }

    public static void main(String[] args) {

        
        Score s1 = new Score();
        s1.name = "홍길동";
        s1.kor = 90;
        s1.eng = 100;
        s1.math = 80;
        s1.sum = s1.kor + s1.eng + s1.math;
        s1.aver = s1.sum / 3f;        

        
        Score s2 = new Score();
        s2.name = "홍길동";
        s2.kor = 90;
        s2.eng = 100;
        s2.math = 80;
        s2.sum = s2.kor + s2.eng + s2.math;
        s2.aver = s2.sum / 3f;
        
        Score s3 = createScore("안중근", 80, 90, 100);
    }
    static Score createScore(String name, int kor, int eng, int math) {
        Score s = new Score();
        
        s.name = name;
        s.kor = kor;
        s.eng = eng;
        s.math = math;
        s.sum = kor + eng + math;
        s.aver = s.sum / 3f;
        
        return s;
    }
}

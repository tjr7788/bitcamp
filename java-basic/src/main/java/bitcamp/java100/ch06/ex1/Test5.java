package bitcamp.java100.ch06.ex1;

public class Test5 {
    public static void main(String[] args) {
        Score4 score = new Score4("홍길동", 40, 30, 20);
        Score4 score2 = new Score4();
        Score4 score3 = new Score4("홍길동");
        
        System.out.println(score.name);
        System.out.println(score.sum);
        System.out.println(score.aver);
        
        System.out.println(score2.name);
        System.out.println(score2.sum);
        System.out.println(score2.aver);
        
        System.out.println(score3.name);
        System.out.println(score3.sum);
        System.out.println(score3.aver);
    }
}
package bitcamp.java100.ch06.ex1;

public class Test10 {
    public static void main(String[] args) {
        Score10 score = new Score10();
        System.out.println(score.name);
        score = new Score10("홍길동");
        System.out.println(score.name);
    }
}
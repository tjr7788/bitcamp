package bitcamp.java100.ch06.ex2;

import java.io.Console;

public class Test2 {

    static Console console;

    static void prepareConsole() {
        console = System.console();
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
    }


    public static void main(String[] args) {
        prepareConsole();
        Score score = new Score();
        while (true) {
            ScoreView.input(score);
            ScoreDAO.add(score);
            
            if (!MessageBox.confirm("계속하시겠습니까?(y or n)")) {
                break;
            }
        }
        
        for (int i = 0; i < ScoreDAO.size(); i++) {
            ScoreView.print(ScoreDAO.get(i));
        }
    }
}
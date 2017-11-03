import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ScoreController {
    private ArrayList<Score> list = new ArrayList<>();
    private Iterator<Score> iterator;
    static Scanner sc = new Scanner(System.in);
    
    public void execute() {
        while (true) {
            System.out.print("성적관리> ");
            String input = sc.next().toLowerCase();
            if (input.equals("add")) {
                this.doAdd();
            } else if (input.equals("list")) {
                this.doList();
            } else if (input.equals("view")) {
                this.doView();
            } else if (input.equals("delete")) {
                this.doDelete();
            } else if (input.equals("update")) {
                this.doUpdate();
            } else if (input.equals("main")) {
                break;
            } else {
                System.out.println("해당 명령이 없습니다.");
            }
        } // while
    }
    
    private void doView() {
        String name = Prompts.input("이름? ");
        iterator = list.iterator();
        boolean result = true;
        while (iterator.hasNext()) {
            Score score = iterator.next();

            if (name.equals(score.getName())) {
                score.view();
                result = false;
                break;
            }
        }
        
        if (result) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        }
    }

    private void doList() {
        iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().list();
        }
    }
    private void doUpdate() {
        String name = Prompts.input("이름? ");
        iterator = list.iterator();
        boolean result = true;
        while (iterator.hasNext()) {
            Score score = iterator.next();
            if (name.equals(score.getName())) {
                score.update();
                result = false;
            }
        }
        if (result) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        }
    }

    private void doDelete() {
        String name = Prompts.input("이름? ");
        iterator = list.iterator();
        boolean result = true;
        while (iterator.hasNext()) {
            Score score = iterator.next();
            if (name.equals(score.getName())) {
                result = false;
                if (Prompts.confirm2("정말삭제하시겠습니까?")) {
                    System.out.println("삭제하였습니다.");
                    list.remove(score);
                } else {
                    System.out.println("삭제취소하였습니다.");
                }
                break;
            }
        }
        if (result) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        }
    }
    
    private void doAdd() {
        while (true) {
            Score score = new Score();
            score.input();
            list.add(score);
            if (!Prompts.confirm("계속하시겠습니까?")) {
                break;
            }
        }
    }
}

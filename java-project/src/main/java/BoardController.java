import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BoardController {
    private ArrayList<Board> list = new ArrayList<>();
    private Iterator<Board> iterator;
    static Scanner sc = new Scanner(System.in);

    public void execute() {
        while (true) {
            System.out.print("게시판> ");
            String input = sc.next().toLowerCase();
            if (input.equals("add")) {
                this.doAdd();
            } else if (input.equals("list")) {
                this.doList();
            } else if (input.equals("view")) {
                this.doView();
            } else if (input.equals("update")) {
                this.doUpdate();
            } else if (input.equals("delete")) {
                this.doDelete();
            } else if (input.equals("main")) {
                break;
            } else {
                System.out.println("해당 명령이 없습니다.");
            }
        } // while
    }

    private void doView() {
        int number = Integer.parseInt(Prompts.input("번호? "));
        iterator = list.iterator();
        boolean result = true;
        while (iterator.hasNext()) {
            Board board = iterator.next();

            if (number == board.number) {
                board.view();
                result = false;
                break;
            }
        }

        if (result) {
            System.out.printf("%d번의 게시물이 없습니다.\n", number);
        }
    }

    private void doList() {
        iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().list();
        }
    }

    private void doUpdate() {
        int number = Integer.parseInt(Prompts.input("번호? "));
        iterator = list.iterator();
        boolean result = true;
        while (iterator.hasNext()) {
            Board board = iterator.next();
            if (number == board.number) {
                board.update();
                result = false;
            }
        }
        if (result) {
            System.out.printf("%d번의 게시물이 없습니다.\n", number);
        }
    }
    private void doDelete() {
        int number = Integer.parseInt(Prompts.input("번호? "));
        iterator = list.iterator();
        boolean result = true;
        while (iterator.hasNext()) {
            Board board = iterator.next();
            if (number == board.number) {
                result = false;
                if (Prompts.confirm2("정말삭제하시겠습니까?")) {
                    System.out.println("삭제하였습니다.");
                    list.remove(board);
                } else {
                    System.out.println("삭제취소하였습니다.");
                }
                break;
            }
        }
        if (result) {
            System.out.printf("%d번의 게시물이 없습니다.\n", number);
        }
    }

    private void doAdd() {
        Board board = new Board();
        int number = Integer.parseInt(Prompts.input("번호? "));
        iterator = list.iterator();
        boolean result = true;
        while (iterator.hasNext()) {
            Board temp = iterator.next();
            if (number == temp.number) {
                System.out.println("이미 등록된 번호입니다.");
                result = false;
                break;
                
            }
        }
        if(result){
            board.input(number);
            list.add(board);
        }
    } 
    
}

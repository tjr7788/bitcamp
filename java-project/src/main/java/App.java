import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static ScoreController scoreControl = new ScoreController();
    static MemberController memberControl = new MemberController();
    static BoardController boardControl = new BoardController();
    public static void main(String[] args) {
        
        loop: while (true) {
            try {
                System.out.print("명령> ");
                String[] input = sc.nextLine().toLowerCase().split(" ");

                if (input[0].equals("menu")) {
                    doMenu();
                } else if (input[0].equals("help")) {
                    doHelp();
                } else if (input[0].equals("quit")) {
                    doQuit();
                    break loop;
                } else if (input[0].equals("go")) {
                    doGo(input[1]);

                } else {
                    doErr();
                }
            } catch (Exception e) {
                System.out.println("명령처리중 문제 발생 ");
            }
        } // while
    }

    private static void doGo(String index) {
        if (index.equals("1")) {
            scoreControl.execute();
        } else if (index.equals("2")) {
            memberControl.execute();
        } else if (index.equals("3")) {
            boardControl.execute();
        } else {
            System.out.println("해당번호의 메뉴가 없습니다.");
        }
    }

    private static void doHelp() {
        System.out.println("[명령]");
        System.out.println("menu        - 메뉴 목록 출력한다.");
        System.out.println("go 번호     - 메뉴로 이동한다.");
        System.out.println("quit        - 프로그램을 종료한다.");
    }

    private static void doMenu() {
        System.out.println("1 성적관리");
        System.out.println("2 회원관리");
        System.out.println("3 게시판");
    }

    private static void doErr() {
        System.out.println("수행할 수 없는 명령입니다.");
    }

    private static void doQuit() {
        System.out.println("프로그램을 종료합니다.");
    }
}


//: ## 캡슐화 적용
//: - 모든 필드에 대해 외부 접근을 차단한다.
//:   단 자식 클래스에서는 직접 접근할 수 있게 허락한다.
//: 

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Board {

    protected int number;
    protected String title;
    protected String content;
    protected String today;
    protected int viewCnt;

    public Board() {
        this.today = date();
    };

    public Board(int number, String title, String content) {
        this.number = number;
        this.title = title;
        this.content = content;
        this.today = date();
    }

    private String date() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void list() {
        System.out.printf("%d, %-4s, %4s, %d\n", this.number, this.title, this.today, this.viewCnt);
    }

    public void input(int number) {
        Scanner sc = new Scanner(System.in);

        this.number = number;

        System.out.print("제목? ");
        this.title = sc.next();

        System.out.print("내용? ");
        this.content = sc.next();
    }

    public void update() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("제목?(%s)", this.title);
        String title = this.title;
        try {
            title = sc.nextLine();
        } catch (Exception e) {}

        System.out.printf("내용? ");
        String content = this.content;
        try {
            content = sc.nextLine();
        } catch (Exception e) {
            content = "";
        }

        if (confirm2("변경하시겠습니까?(y/N) ")) {
            this.title = title;
            this.content = content;
            this.today = date();
            System.out.println("변경하였습니다.");

        } else {
            System.out.println("변경을 취소하였습니다.");
        }
    }

    static boolean confirm2(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        String response = sc.nextLine().toLowerCase();

        if (response.equals("n") || response.equals("no") || response.equals("")) {
            return false;
        }
        return true;
    }

    public void view() {
        System.out.printf("제목 : %s\n" + "내용 : %s\n" + "등록일 : %s\n" + "조회수 : %d\n", this.title, this.content, this.today,
                ++this.viewCnt);
    }
}

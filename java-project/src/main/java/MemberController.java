import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberController {
    private ArrayList<Member> list = new ArrayList<>();
    private Iterator<Member> iterator;
    static Scanner sc = new Scanner(System.in);
    
    public void execute() {
        while (true) {
            System.out.print("회원관리> ");
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
        String email = Prompts.input("이메일? ");
        iterator = list.iterator();
        boolean result = true;
        while (iterator.hasNext()) {
            Member member = iterator.next();

            if (email.equals(member.email)) {
                member.view();
                result = false;
                break;
            }
        }
        
        if (result) {
            System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
        }
    }

    private void doList() {
        iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().list();
        }
    }
    private void doUpdate() {
        String email = Prompts.input("이메일? ");
        iterator = list.iterator();
        boolean result = true;
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (email.equals(member.email)) {
                member.update();
                result = false;
            }
        }
        if (result) {
            System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
        }
    }

    private void doDelete() {
        String email = Prompts.input("이메일? ");
        iterator = list.iterator();
        boolean result = true;
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (email.equals(member.email)) {
                result = false;
                if (Prompts.confirm2("정말삭제하시겠습니까?")) {
                    System.out.println("삭제하였습니다.");
                    list.remove(member);
                } else {
                    System.out.println("삭제취소하였습니다.");
                }
                break;
            }
        }
        if (result) {
            System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
        }
    }
    
    private void doAdd() {
        while (true) {
            Member member = new Member();
            member.input();
            list.add(member);
            if (!Prompts.confirm("계속하시겠습니까?")) {
                break;
            }
        }
    }
}

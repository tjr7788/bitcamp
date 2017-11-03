//: ## 캡슐화 적용
//: - 모든 필드에 대해 외부 접근을 차단한다.
//:   단 자식 클래스에서는 직접 접근할 수 있게 허락한다.
//: 

import java.util.Scanner;

public class Member {  
    
    protected String name;
    protected String email;
    protected int password;
    
    public Member() {};
    
    public Member(String name, String email, int password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    
    public void list() {
        System.out.printf("%-4s, %4s\n", 
                this.name, 
                this.email 
                );
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("이름? ");
        this.name = sc.nextLine();
        
        System.out.print("이메일? ");
        this.email = sc.next();
        
        System.out.print("암호? ");
        this.password = sc.nextInt();
    }
    
    public void update() {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("이름?(%s)", this.name);
        String name = this.name;
        try {
            name = sc.nextLine();
        } catch(Exception e) {}
        
        System.out.printf("암호?(%d) ", this.password);
        int password = this.password;
        try {
            password = Integer.parseInt(sc.nextLine());
        } catch(Exception e) {}
        
        if (confirm2("변경하시겠습니까?(y/N) ")) {
            this.name = name;
            this.password = password;
            System.out.println("변경하였습니다.");
            
        } else {
            System.out.println("변경을 취소하였습니다.");
        }
    }
    
    static boolean confirm2(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        String response = sc.nextLine().toLowerCase();
        
        if (response.equals("n") || 
                response.equals("no") || 
                response.equals("")) {
            return false;
        }
        return true;
    }

    public void view() {
        System.out.printf("%-4s, %4s, %4d\n",  
                this.name,
                this.email,
                this.password);
    }
}

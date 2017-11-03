import java.util.Scanner;

public class Score{
    protected String name;
    protected int[] subjects;
    protected int sum;
    protected float aver;
    
    public Score() {
        this.subjects = new int[3];
    }
    
    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects = new int[] {kor, eng, math};
        this.compute();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void compute() {
        int sum = 0;
        for(int i : this.subjects) {
            sum += i;
        }
        this.sum = sum;
        this.aver = (float)this.sum / this.subjects.length;
    }
    
    //: 성적 데이터를 출력하는 코드를 별도의 메서드로 분리한다.
    
    public void delete() {
        
    }
    public void view() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                this.name,
                this.subjects[0],
                this.subjects[1],
                this.subjects[2],
                this.sum,
                this.aver);
    }
    public void list() {
        System.out.printf("%-4s, %4d, %6.1f\n",  
                this.name,
                this.sum,
                this.aver);
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        this.name = sc.next();
        
        System.out.print("국어 : ");
        this.subjects[0] = sc.nextInt();

        System.out.print("영어 : ");
        this.subjects[1] = sc.nextInt();

        System.out.print("수학 : ");
        this.subjects[2] = sc.nextInt();
        this.compute();
    }
    static boolean confirm2(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        String word = sc.nextLine().toLowerCase();
        if (word.equals("n") || word.equals("no") || word.equals("")) {
            return false;
        } 
            return true;
    }
    public void update() {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("국어 : (%d) ", this.subjects[0]);
        int subject0 = this.subjects[0];
        try {
            subject0 = Integer.parseInt(sc.nextLine());
        } catch(Exception e) {}
        System.out.printf("영어 : (%d) ", this.subjects[1]);
        int subject1 = this.subjects[1];
        try {
            subject1 = Integer.parseInt(sc.nextLine());
        } catch(Exception e) {}
        System.out.printf("수학 : (%d) ", this.subjects[2]);
        int subject2 = this.subjects[2];
        try {
            subject2 = Integer.parseInt(sc.nextLine());
        } catch(Exception e) {}
        if(confirm2("변경하시겠습니까?")) {
            this.subjects[0] = subject0;
            this.subjects[1] = subject1;
            this.subjects[2] = subject2;
            this.compute();
            System.out.println("변경완료");
        }
        else {
            System.out.println("변경을 취소하셨습니다.");
        }
        
    }
}

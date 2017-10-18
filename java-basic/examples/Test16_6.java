

package bitcamp.java100;

public class Test16_6 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("===============================");
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println(i);
        }
        System.out.println("===============================");
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }
        System.out.println("===============================");
        int i = 0;
        for(;i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("===============================");
        i = 0;
        for(;i < 5;) {
            System.out.println(i);
            i++;
        }
        System.out.println("===============================");
        i = 0;
        for(;;) {
            System.out.println(i);
            i++;
            if (i == 5)
                break;
        }
        System.out.println("===============================");
        String[] names = {"홍길동", "임꺽정", "유관순"};
        for (int ii = 0; ii < names.length; ii++) { 
            System.out.println(names[ii]);
        }
        System.out.println("===============================");
        label1:
        for(int a = 1; a <= 5; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
                if (b == 2)
                    break label1;
            }
            System.out.println();
        }
        for (int f = 2; f < 10; f++) {
            for (int e = 1; e <10; e++) {
                System.out.printf("%d * %d = %d\n", f,e,f*e);
            }
        }
        
        int v =98761234;
        for (;v > 0; v /= 10) {
            System.out.println(v % 10);
        }
        for (int a = 0; a < 6; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            for (int c = 5; c > a; c--) {
                System.out.print(" ");
            }
            for (int c = 5; c > a; c--) {
                System.out.print(" ");
            }
            for (int d = 0; d < a; d++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 0; a < 6; a++) {
            for (int b =5; b > a; b--) {
                System.out.print("*");
            }
            for (int c = 0; c < a; c++) {
                System.out.print(" ");
            }
            for (int c = 0; c< a; c++) {
                System.out.print(" ");
            }
            for (int d = 5; d > a; d--) {
                System.out.print("*");
            }
            System.out.println();            
        }

    }
}

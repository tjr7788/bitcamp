

package bitcamp.java100;

public class Test16_3 {

    public static void main(String[] args) {
        int level = 0;
        switch (level) {
        case 0: System.out.println("손님"); 
        case 1: System.out.println("회원"); 
        case 2: System.out.println("관리자"); 
        default: System.out.println("유효하지 않은 회원입니다.");
        }

        byte b = 10;
        short s = 10;
        int i = 10;
        char c = 10;
        String str = "hello";


        switch (b) {}
        switch (s) {}
        switch (i) {}
        switch (c) {}
        switch (str) {}
        //        switch (l) {}
        //        switch (f) {}
        //        switch (d) {}
        //        switch (bool) {}
        String v1 = "유아";
        switch (v1) {
        case "유아":; 
        case "노인": System.out.println("무료승차"); break; 
        case "어린이2": System.out.println("관리자"); 
        default: System.out.println("유효하지 않은 회원입니다.");
        }

    }
}

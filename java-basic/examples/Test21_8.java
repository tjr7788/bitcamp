
package bitcamp.java100;

import java.io.Console;
import java.util.ArrayList;

public class Test21_8 {
    public static void main(String[] args) {
        
        class Info {
            String name;
            String email;
            String phone;
        }
        
        Console console = System.console();
        ArrayList<Info> arr = new ArrayList<>();
        
        do {
            Info in = new Info();    
            String name = console.readLine("이름 : ");
            if(name.matches("\\D+")) {
                in.name = name;
            }
            else {
                System.out.println("다시 입력하세요");
                continue;
            }
            String email = console.readLine("이메일 : ");
            if(email.matches(".+@.+\\..+")) {
                in.email = email;
            }
            else {
                System.out.println("다시 입력하세요");
                continue;
            }
            in.phone = console.readLine("전화 : ");
            if ((console.readLine("저장하시겠습니다?(y/n)").equals("y"))) {
                arr.add(in);
            }
        } while ((console.readLine("계속입력?(y/n)")).equals("y"));
        for (int i = 0; i < arr.size(); i++) {
            
            System.out.printf("이름 : %s\t",arr.get(i).name);
            System.out.printf("이메일 : %s\t",arr.get(i).email);
            System.out.printf("전화 : %s\n",arr.get(i).phone);
        }
    }
}

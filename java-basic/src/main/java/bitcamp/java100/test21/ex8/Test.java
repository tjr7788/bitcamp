
package bitcamp.java100.test21.ex8;

import java.io.Console;

public class Test {
    static Console console;
    
    static void prepareConsole() {
        console = System.console();
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
    }
    
    static void printConatacts() {

        for (int i = 0; i < ContactArray.size(); i++) {
            Contact contact = ContactArray.get(i);
            System.out.printf("%s %s %s\n",contact.name, 
                    contact.email, contact.tel);
        }
    }
    
    static Contact inputContact() {
        Contact contact = new Contact();
        contact.name = console.readLine("이름 : ");
        contact.email = console.readLine("이메일 : ");
        contact.tel = console.readLine("전화번호 : ");
        return contact;
    }
    
    public static void main(String[] args) {
        
        prepareConsole();

        while (true) {
            Contact contact = inputContact();
            if (ContactArray.confirm("저장하시겠습니까?")) {
                try {
                    ContactArray.add(contact);
                } catch (RuntimeException e ) {
                    System.err.println("최대 저장 개수를 초과하였습니다.");
                    break;
                }
            }
            if (!ContactArray.confirm("더 하시겠습니까?")) {
                break;
            }
        }
        printConatacts();
    }
}


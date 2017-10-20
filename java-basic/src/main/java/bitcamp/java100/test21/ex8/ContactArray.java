package bitcamp.java100.test21.ex8;

import java.io.Console;

public class ContactArray {
    static Contact[] contacts = new Contact[100];;
    static int cursor;
    static Console console;
    
    

    static boolean confirm(String message) {
        String response = console.readLine(message + "(y or n)");
        if (!(response.toLowerCase().equals("y") ||
                response.toLowerCase().equals("yes"))) {
            return false;
        } return true;
    }
    
    static void add(Contact contact) {
        if (cursor > contacts.length) throw new RuntimeException("최대 저장 개수 초과");
        contacts[cursor] = contact;
        cursor++;
    }
    
    static Contact get(int index) {
        if (index < 0 || index >= cursor) throw new RuntimeException("유효하지 않은 인덱스");
        return contacts[index];
    }
    
    static int size() {
        return cursor;
    }
}

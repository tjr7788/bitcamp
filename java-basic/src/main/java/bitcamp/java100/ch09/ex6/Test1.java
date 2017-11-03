package bitcamp.java100.ch09.ex6;

public class Test1 {
    
    public static void main(String[] args) {
        Stack contacts = new Stack();
        
        contacts.push(new Contact("홍길동","ghdrlfehd@email","010-3231-3213"));
        contacts.push(new Contact("홍길동1","ghdrlfehd1@email","010-3231-3211"));
        contacts.push(new Contact("홍길동2","ghdrlfehd2@email","010-3231-3212"));
        
        contacts.push("안중근");
        contacts.push(true);
        System.out.println(contacts.pop());
        System.out.println(contacts.pop());
        System.out.println((Contact)contacts.pop());
        
        
        BookStack bookStack = new BookStack();
        bookStack.push(new Book());
        bookStack.push(new Book());
        Book b1 = bookStack.pop();
        Book b2 = bookStack.pop();
        
        ScoreStack scoreStack = new ScoreStack();
        scoreStack.push(new Score());
        scoreStack.push(new Score());
        Score s1 = scoreStack.pop();
        Score s2 = scoreStack.pop();
        
        ContactStack contactStack = new ContactStack();
        contactStack.push(new Contact());
        contactStack.push(new Contact());
        Contact c1 = contactStack.pop();
        Contact c2 = contactStack.pop();
        
        Stack2 c4 = new Stack2();
        Stack2<Contact> c3 = new Stack2<>();
        c3.push(new Contact());
        Contact c5 = c3.pop();
        
    }
}
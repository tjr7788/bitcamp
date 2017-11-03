package bitcamp.java100.ch07.ex5;

public class A {
    
    A() {
        //super(); 적어주지않아도 자동으로 붙게된다. 또한 내가 적어주게 되더라도 무조건 첫번쨰로 호출해줘야한다.
        //         그렇지않으면 컴파일오류이다.
        System.out.println("A() 생성자 실행");
        
    }
    A(String a) {
        //super(); 적어주지않아도 자동으로 붙게된다. 또한 내가 적어주게 되더라도 무조건 첫번쨰로 호출해줘야한다.
        //         그렇지않으면 컴파일오류이다.
        System.out.printf("A(%s) 생성자 실행\n",a);
        
    }
}

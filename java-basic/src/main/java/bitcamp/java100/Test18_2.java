package bitcamp.java100;

public class Test18_2 {
    public static void main(String[] args) {
        String s1;

        s1 = "ABC가각간";  


        String s2 = "ABC가각간";

        if(s2 == s1) {
            System.out.println("같음");
            // 이유는?
        }   // 리터럴을 이용하여 암시적으로 String 인스턴스를 만들 때는 
            // constants pool(상수풀)이라는 별도의 영역에 인스턴스가 생성된다.
            // constants pool에서는 중복된 내용의 인스턴스를 생성하지않음.
            // 따라서 s2에 저장된 인스턴스 주소는 s1에서 생성된
            // 기존 String 인스턴스 주소이다. 인스턴스는 heap에만들어지지만
            // 이녀석은 constants pool에 만들어진다.
    }
}



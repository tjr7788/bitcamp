package bitcamp.java100;

public class Test18_5 {
    public static void main(String[] args) throws Exception{
        String s1 = "ABC가각간";  
        String s2 = s1.replace("ABC가각간","하하하");
        
        System.out.println(s1);
        System.out.println(s2);
        
        
        System.out.println(s1.substring(3, 4));
        
        
        s1 = "홍길동";
        
        System.out.println("홍길동".startsWith("홍길"));
        
        System.out.println("홍길동".endsWith("길"));
        
        s1 = "홍길동, 유관순, 임꺽정, 안중근, 윤봉길, 이육사, 윤동주";
        
        System.out.println(s1.contains("김꺽정"));
        
        String s3 = "abc";
        String s4 = "가각간";
        
        System.out.println(s3.concat(s4));
        
        s3 = "탕수육";
        s4 = "탕수육2";
        String s5 = "탈수육";
        String s6 = "탕수육";
        
        System.out.println(s3.compareTo(s6));
        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareTo(s5));
        
        s1 = "홍길동";
        s2 = "";    //빈 문자열
        s3 = null;  //인스턴스가 없다(실행오류)
                    //주의할점 빈문자열과 인스턴스가 없다는 것은 다르다.
        
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
//        System.out.println(s3.isEmpty());   //오류
        
        s1 = "홍길동, 유관순, 임꺽정, 안중근, 윤봉길, 이육사, 윤동주";
        
        String[] arr = s1.split(", ");
        
        for(String i : arr) {
            System.out.println(i);
        }
        
        s1 = "Hong Gil Dong";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        
        s1 = "ABC\n가각간\n똘똠똥";
        System.out.println(s1.trim());
        
        
        
        
        s1 = String.valueOf(true);
        s2 = String.valueOf(3.14);
        s3 = String.valueOf(300);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        s1 = "ABC\n가각간\n똘똠똥";
        byte[] bytes = s1.getBytes("UTF-8");
        for (byte b : bytes) {
            System.out.print(Integer.toHexString(b & 0x00ff));
            System.out.print(" ");
        }    
        s1 = "ABc";
        s2 = "가각간";
        s3 = s1 + s2;
        System.out.println(s3);
            
        
    }
}




package bitcamp.java100;

public class Test12_9{
    public static void main(String[] args){
        char c1;
        c1 = 44032;
        char c2= 0xac00;

        char n1,n2,n3;

        n1 = 0xAE40;
        n2 = 0xC11D;
        n3 = 0xD76C;

        System.out.printf("%c%c%c",n1,n2,n3);

        n1 = '홍';
        n2 = '길';
        n3 = '동';

        System.out.printf("%c%c%c",n1,n2,n3);

        char x = '7';
        
        int num = x-'0';
        System.out.println(num);
        
    }
}
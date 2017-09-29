package bitcamp.java100;

public class Test14_2{
    public static void main(String[] args){    
        class Book{
            String title, writer, maker;
            int pageSize;
            float pay;
        }
        Book bk = new Book();
        
        bk.title = "자바";
        bk.writer = "나";
        bk.maker = "학원";
        bk.pageSize = 230;
        bk.pay = 3.2f;
        

        System.out.printf("%s, %s, %s, %dpage, %f$",bk.title,bk.writer,bk.maker,bk.pageSize,bk.pay);
    }
}
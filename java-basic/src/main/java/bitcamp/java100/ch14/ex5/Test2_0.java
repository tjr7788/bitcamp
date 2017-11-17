package bitcamp.java100.ch14.ex5;

import java.io.FileWriter;

public class Test2_0 {
    public static void main(String[] args) throws Exception {
        FileWriter out = new FileWriter("test.txt");
        
        String str = "ABC가각";
        out.write(str);
        
        System.out.println("출력");
        out.close();
    }
}

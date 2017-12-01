package bitcamp.java100.ch17.ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("변경할 게시물번호 : ");
        String no = sc.nextLine();
        
        System.out.print("제목 : ");
        String title = sc.nextLine();
        
        System.out.print("내용 : ");
        String contents = sc.nextLine();
        sc.close();
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb",
                "study", "1111");
        
        PreparedStatement pstmt = con.prepareStatement("update jdbc_test set title=?, conts=? where no=?");
        
        pstmt.setString(1, title);
        pstmt.setString(2, contents);
        pstmt.setString(3, no);
        
        pstmt.executeUpdate();
        
        pstmt.close();
        con.close();
    }
}

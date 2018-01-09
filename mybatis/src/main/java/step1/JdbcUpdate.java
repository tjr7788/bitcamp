// DBMS 서버에게 SQL문을 보내기 - update
// => 데이터 입출력 테스트를 위한 테이블 생성하라!
//    bitcamp-docs/jdbcexam.sql 을 실행하라!
// 
package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcUpdate {

    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb",
                "study", "1111");
        
        System.out.println("연결되었음!");
        
        Statement stmt = con.createStatement();
        
        // Statement 객체의 메서드를 통해 SQL문을 서버에 보낸다.
        stmt.executeUpdate(
            "update jdbc_test set title='xxx', conts='xxxx' where no=1");
        
        System.out.println("변경 완료!");
        
        stmt.close();
        con.close();
    }

}









